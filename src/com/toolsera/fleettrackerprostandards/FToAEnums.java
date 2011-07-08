/*
 * 
 */
package com.toolsera.fleettrackerprostandards;

/**
 * The Class FToAEnums, this class holds all the standards to the Androdi to server and server to Androif communications, these are used to defice which case is which.
 */

/**
 * @author <a href="http://shereef.net">Shereef Marzouk</a>
 * 
 */
public class FToAEnums {

	/**
	 * The Enum Database for all database communication cases.
	 */
	public enum Db {

		/**
		 * When a manager is requesting to get the location of a specific
		 * employee.
		 */
		getlocation, getlocationupdate,
		/**
		 * When a manager is requesting to get the phone of a specific employee.
		 */
		getphone,
		/**
		 * When a manager is requesting to get all employee names and UIDs from
		 * database.
		 */
		getusers,
		/**
		 * When a manager is requesting to get all employees count from
		 * database.
		 */
		getuserscount,
		/**
		 * The login request which takes the user/hashedpasswords and sends the
		 * full client info.
		 */
		login,
		/**
		 * The new user, which takes all user info and compares it to the data
		 * in the database and returns the result.
		 */
		newuser,
		/**
		 * when the employee gets a location update it sends it to the database.
		 */
		setlocation,
		/**
		 * The when the android receives the c2dm registration reply it sends
		 * the registration id to the database.
		 */
		setregid;
	}

	/**
	 * The main enumeration for messages.
	 */
	public enum Msgs {

		/** When the manager wants to send an employee an Alarm. */
		Alarm,
		/**
		 * When the server checks at login if a device needs registration it
		 * sends this element to notify the android it needs to register for
		 * C2DM.
		 */
		C2DMRegister,
		/**
		 * When the server checks at login if a device needs registration it
		 * sends this element to notify the android it does not need to register
		 * for C2DM.
		 */
		C2DMRegistered,
		/** The manager tells the employee's phone to call him. */
		Call,
		/**
		 * This specifies for the server that the android needs something fro
		 * mthe database so that the server can enter the following switch case.
		 */
		Database, gpsprovidordisabled,
		/**
		 * The server notifies the emlpoyee's device that i needs to update it's
		 * Location.
		 */
		Location,
		/** a notification message sent from the Manager to the Employee. */
		Popup,
		/** a vibration request for x seconds from the manager to the employee. */
		stoplocationupdates, Vibration,
		/**
		 * The manager requests to change the volume of the device with the
		 * direction increase or decrease.
		 */
		Volume;
	}

	/**
	 * This enumeration defines the Registration Result cases.
	 */
	public enum RegRes {

		/** The Email is already used. */
		EmailAlreadyUsed,
		/** The Email is invalid. */
		EmailInvalid,
		/** Success. */
		Success,
		/** The Request timed outTimeout. */
		Timeout,
		/** Un-handeled exception. */
		UnhandeledException,
		/** The User name is already used. */
		UsernameAlreadyUsed,
		/** The User name is invalid. */
		UserNameInvalid;
	}
}
