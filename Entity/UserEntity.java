package com.project.BugTracker.Entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotNull;

//Class declaration
@Entity
public class UserEntity {

	@Id // primary key
	@GeneratedValue // auto_increment for primary key
	private int id;

	@NotNull(message = "firstName is mandatory") // validations
	private String firstName;

	@NotNull(message = "LastName is mandatory") // validations
	private String LastName;

	// Mapping relationship
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "addressId", referencedColumnName = "id")
	private AddressEntity addressEntity;

	@Override
	public String toString() {
		return "UserEntity [id=" + id + ", firstName=" + firstName + ", LastName=" + LastName + "]";
	}

	public UserEntity(int id, @NotNull(message = "firstName is mandatory") String firstName,
			@NotNull(message = "LastName is mandatory") String lastName) { // parameterized constructor
		super();
		this.id = id;
		this.firstName = firstName;
		this.LastName = lastName;
	}

	public UserEntity() { // no arg constructor
		super();
	}

	// getters and setters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	public AddressEntity getAddressEntity() {
		return addressEntity;
	}

	public void setAddressEntity(AddressEntity addressEntity) {
		this.addressEntity = addressEntity;
	}

}
