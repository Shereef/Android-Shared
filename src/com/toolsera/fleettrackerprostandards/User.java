/**
 * 
 */
package com.toolsera.fleettrackerprostandards;

import java.io.Serializable;

// TODO: Auto-generated Javadoc
/**
 * The Class User.
 *
 * @author Shereef Marzouk
 */
public class User implements Serializable {
	
	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 8436377738400549713L;
	
	/** The email. */
	public String email;
	
	/** The firstname. */
	public String firstname;
	
	/** The hashedpassword. */
	public String hashedpassword;
	
	/** The lastname. */
	public String lastname;
	
	/** The manager. */
	public int manager;
	
	/** The mobile. */
	public String mobile;
	
	/** The uid. */
	public int uid;
	
	/** The username. */
	public String username;

	/**
	 * Instantiates a new user.
	 */
	public User() {
		manager = -1;
	}

	/**
	 * Instantiates a new user.
	 *
	 * @param i the i
	 */
	public User(int i) {
		manager = i;
	}
}
