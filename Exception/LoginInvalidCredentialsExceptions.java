package com.project.BugTracker.Exception;

public class LoginInvalidCredentialsExceptions extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public LoginInvalidCredentialsExceptions(String msg) {
		super(msg);
	}

}
