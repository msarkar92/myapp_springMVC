package com.mrinal.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Cart {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="cart_id", nullable=false, unique=true, length=11)
	private int cartId;
	
	private String cartName;
	
	@OneToMany(mappedBy="cart")
	private List<Item> items;
	
	

	public int getCart_id() {
		return cartId;
	}

	public void setCart_id(int cartId) {
		this.cartId = cartId;
	}

	
	public String getCartName() {
		return cartName;
	}

	public void setCartName(String cartName) {
		this.cartName = cartName;
	}

	public List<Item> getItems() {
		return items;
	}

	public void setItems(List<Item> items) {
		this.items = items;
	}

}
