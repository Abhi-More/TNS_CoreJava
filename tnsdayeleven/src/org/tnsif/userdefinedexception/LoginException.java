package org.tnsif.userdefinedexception;

/*To use custom exception we have to extend the Exception class*/
public class LoginException extends Exception{
	private String str;

	public LoginException(String str) {
		super();
		this.str = str;
	}

	public String getStr() {
		return str;
	}

	public void setStr(String str) {
		this.str = str;
	}

	@Override
	public String toString() {
		return "LoginException [str=" + str + "]";
	}
		
}
