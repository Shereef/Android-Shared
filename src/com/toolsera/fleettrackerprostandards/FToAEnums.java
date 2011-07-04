package com.toolsera.fleettrackerprostandards;

/**
 * 
 */

/**
 * @author Shereef Marzouk
 * 
 */
public class FToAEnums {

	public enum Db {
		getphone, getusers, getuserscount, login, newuser, setregid, setlocation, getlocation;
	}

	public enum Msgs {
		Alarm, C2DMRegister, C2DMRegistered, Chat, Database, Location, Popup, Vibration, Volume, Wakelock;
	}

	public enum RegRes {
		EmailAlreadyUsed, EmailInvalid, Success, Timeout, UnhandeledException, UsernameAlreadyUsed, UserNameInvalid;
	}
}
