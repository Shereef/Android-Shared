/**
 * 
 */
package com.toolsera.fleettrackerprostandards;

import java.io.Serializable;

/**
 * The Class User contains a User full information, warning not all fields will
 * be set at all times. this class implements Serializable to have the ability
 * to be written to file or sockets
 * 
 * @author <a href="http://shereef.net">Shereef Marzouk</a>
 */
public class User implements Serializable {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 8436377738400549713L;

	/** The user's email. */
	public String email;

	/** The user's first name. */
	public String firstname;

	/** The user's hashed password. */
	public String hashedpassword;

	/** The user's last name. */
	public String lastname;

	/** Whether the user is a manager or not. */
	public int manager;

	/** The user's mobile. */
	public String mobile;

	/** The user's uid. */
	public int uid;

	/** The user's user name. */
	public String username;

	/**
	 * Instantiates a new user, with an invalid manager value (indicates an
	 * invalid login)
	 */
	public User() {
		manager = -1;
	}

	/**
	 * Instantiates a new user with a custom manager value.
	 * 
	 * @param i
	 *            the manager value (signed int)
	 */
	public User(int i) {
		manager = i;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "User [email=" + email + ", firstname=" + firstname
				+ ", hashedpassword=" + hashedpassword + ", lastname="
				+ lastname + ", manager=" + manager + ", mobile=" + mobile
				+ ", uid=" + uid + ", username=" + username + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + "]";
	}
}
