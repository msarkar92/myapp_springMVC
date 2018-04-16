package com.mrinal.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name="LOGIN",uniqueConstraints={@UniqueConstraint(columnNames={"LOGIN_ID"})})
public class Login {
	@Id
	@Column(name="LOGIN_ID", nullable=false, unique=true, length=10)
	int loginId;
	
	@Column(name="LOGINVALUE", nullable=false, unique=true, length=100)
	String loginValue;
	
	String loginPassword;
	String loginRole;
	public int getLoginId() {
		return loginId;
	}
	public void setLoginId(int loginId) {
		this.loginId = loginId;
	}
	public String getLoginValue() {
		return loginValue;
	}
	public void setLoginValue(String loginValue) {
		this.loginValue = loginValue;
	}
	public String getLoginPassword() {
		return loginPassword;
	}
	public void setLoginPassword(String loginPassword) {
		this.loginPassword = loginPassword;
	}
	public String getLoginRole() {
		return loginRole;
	}
	public void setLoginRole(String loginRole) {
		this.loginRole = loginRole;
	}
	
	

}
