package com.mrinal.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.ResourceBundle;

import org.slf4j.LoggerFactory;

public class DBUtil {
	
	//To maintain log
	final static org.slf4j.Logger log=LoggerFactory.getLogger(DBUtil.class);
	
	/*
	public static void main(String args[]){
		getConnectin();
	}
	*/
	
	//Create DB Connection
	public static Connection getConnectin(){
		Connection con=null;
		try{  
			ResourceBundle rb= ResourceBundle.getBundle("mysql");
			String url=rb.getString("db.url");
			String username=rb.getString("db.username");
			String pass=rb.getString("db.password");
			
			
			//step1 load the driver class
			Class.forName("com.mysql.jdbc.Driver"); 

			//step2 create  the connection object
			con = DriverManager.getConnection(url,username,pass);
		}
		catch(Exception e){
			log.error(e.getMessage());
		}
		return con;
	}
	
}
