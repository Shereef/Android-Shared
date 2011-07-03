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
	public String email;
	public String firstname;
	public String hashedpassword;
	public String lastname;
	public int manager;
	public String mobile;
	public int uid;
	public String username;

	public User() {
		manager = -1;
	}

	public User(int i) {
		manager = i;
	}
}
