package com.mrinal.dao;

import com.mrinal.model.Login;

public interface LoginDAO {
	public Boolean validateLogin(Login user);
}
