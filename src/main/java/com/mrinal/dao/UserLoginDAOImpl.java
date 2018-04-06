package com.mrinal.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.mrinal.model.User;

public class UserLoginDAOImpl implements LoginDAO {
	
	private static SessionFactory SESSION_FACTORY=new Configuration().configure().buildSessionFactory();
	

	@Override
	public Boolean validateLogin(User user) {
		// TODO Auto-generated method stub
		return null;
	}
	
	public static void save(User user) {
		Session session=SESSION_FACTORY.openSession();
		session.beginTransaction();
		session.save(user);
		session.getTransaction().commit();
		session.close();
	}
	
	public static void save_reg(User user) {
		//To get the connection object
				Connection con=DBUtil.getConnectin();
				PreparedStatement pstmt=null;
				try {
				pstmt=con.prepareStatement("insert into user(name,password) values(?,?)");
				//pstmt.setInt(1, 1);
				pstmt.setString(1, user.getName());
				pstmt.setString(2, user.getPassword());
				pstmt.executeUpdate();
				}
				catch(Exception e) {
					System.out.println(e);
				}
	}

}
