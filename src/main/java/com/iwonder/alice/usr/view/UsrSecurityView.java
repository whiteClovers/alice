package com.iwonder.alice.usr.view;

import com.iwonder.alice.usr.entity.UsrSecurity;

public class UsrSecurityView extends UsrSecurity{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String userName;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}


}