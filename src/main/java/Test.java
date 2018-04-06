import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.mrinal.model.Cart;
import com.mrinal.model.Item;

public class Test {
	private static SessionFactory SESSION_FACTORY=new Configuration().configure().buildSessionFactory();

	public static void main(String[] args) {
		Cart cart1=new Cart();
		cart1.setCart_id(1);
		List<Item> items=new ArrayList<>();
		Item item1=new Item(1,"Headphone",cart1);
		Item item2=new Item(2,"Mobile",cart1);
		items.add(item1);
		items.add(item2);
		Session session=SESSION_FACTORY.openSession();
		session.beginTransaction();
		session.save(cart1);
		session.save(item1);
		session.save(item2);
		session.getTransaction().commit();
		session.close();
		
		//Cart cart1=null;
		session=SESSION_FACTORY.openSession();
		session.beginTransaction();
		cart1=(Cart)session.get(Cart.class, 1);
		cart1.setCartName("mycart");
		session.saveOrUpdate(cart1);
		session.getTransaction().commit();
		session.close();
	}

}
