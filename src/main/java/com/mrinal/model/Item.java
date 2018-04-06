package com.mrinal.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Item {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="item_id", nullable=false, unique=true, length=11)
	private int itemId;
	
	private String itemNmae;
	
	@ManyToOne
	@JoinColumn(name="cart_id")
	private Cart cart;
	
	public Item() {
	}
	
	public Item(int id,String itemName, Cart cart) {
		
		this.itemId=id;
		this.itemNmae=itemName;
		this.cart=cart;
		
	}

	public int getItemId() {
		return itemId;
	}

	public void setItemId(int itemId) {
		this.itemId = itemId;
	}

	public String getItemNmae() {
		return itemNmae;
	}

	public void setItemNmae(String itemNmae) {
		this.itemNmae = itemNmae;
	}

	public Cart getCart() {
		return cart;
	}

	public void setCart(Cart cart) {
		this.cart = cart;
	}
}
