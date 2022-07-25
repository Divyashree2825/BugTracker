package com.project.BugTracker.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

//Class declaration
@Entity
public class AddressEntity {

	@Id // primary key
	@GeneratedValue // auto_increment for primary key
	private int id;

	@NotNull(message = "city is mandatory") // validations
	private String city;

	@NotNull(message = "state is mandatory") // validations
	private String state;

	@NotNull(message = "pincode is mandatory") // validations
	private int pincode;

	public AddressEntity() { // no arg constructor
		super();
	}

	public AddressEntity(int id, @NotNull(message = "city is mandatory") String city,
			@NotNull(message = "state is mandatory") String state,
			@NotNull(message = "pincode is mandatory") int pincode) { // parameterized constructor
		super();
		this.id = id;
		this.city = city;
		this.state = state;
		this.pincode = pincode;
	}

	// getters and setters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	@Override
	public String toString() {
		return "AddressEntity [id=" + id + ", city=" + city + ", state=" + state + ", pincode=" + pincode + "]";
	}

}
