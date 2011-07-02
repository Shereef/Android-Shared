/**
 * 
 */
package com.toolsera.fleettrackerprostandards;

import java.io.Serializable;

/**
 * @author Shereef Marzouk
 * 
 */
public class User implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 8436377738400549713L;
	public String firstname;
	public String lastname;
	public String email;
	public String username;
	public String phone;
	public String hashedpassword;
	public int uid;
	public int manager;

	public User() {
		manager = -1;
	}

	public User(int i) {
		manager = i;
	}
}
