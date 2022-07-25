package com.project.BugTracker.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

//Class declaration
@Entity
public class AdminEntity {

	@Id // denotes the primary key
	@GeneratedValue // Auto_increment for the primary key value
	@NotNull(message = "id is mandatory") // validations
	private int id;

	@NotNull(message = "name is mandatory") // validations
	private String name;

	@NotNull(message = "contact is mandatory") // validations
	private String contact;

	public AdminEntity() { // no arg constructor
		super();
	}

	public AdminEntity(@NotNull(message = "id is mandatory") int id,
			@NotNull(message = "name is mandatory") String name,
			@NotNull(message = "contact is mandatory") String contact) { // parameterized constructor
		super();
		this.id = id;
		this.name = name;
		this.contact = contact;
	}

	@Override
	public String toString() {
		return "AdminEntity [id=" + id + ", name=" + name + ", contact=" + contact + "]";
	}

	// getters and setters

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

}
