package com.project.BugTracker.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;

//Class declaration
@Entity
public class LoginEntity {

	@Id // primary key
	@Email(message = "email is not valid") // validations
	private String email;

	@NotNull(message = "password is mandatory") // validations
	private String password;

	@NotNull(message = "role is mandatory") // validations
	private String role;

	@Override
	public String toString() {
		return "LoginEntity [email=" + email + ", password=" + password + ", role=" + role + "]";
	}

	// getters and setters
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public LoginEntity(@Email(message = "email is not valid") String email,
			@NotNull(message = "password is mandatory") String password,
			@NotNull(message = "role is mandatory") String role) { // parameterized constructor
		super();
		this.email = email;
		this.password = password;
		this.role = role;
	}

	public LoginEntity() { // no arg constructor
		super();
	}

}
