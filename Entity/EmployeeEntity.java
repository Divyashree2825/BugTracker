package com.project.BugTracker.Entity;

import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;

//Class declaration
@Entity
public class EmployeeEntity {

	@Id // primary key
	@GeneratedValue // auto_increment for primary key
	private int id;

	@NotNull(message = "firstName is mandatory") // validations
	private String firstName;

	@NotNull(message = "lastName is mandatory") // validations
	private String lastName;

	@NotNull(message = "designation is mandatory") // validations
	private String designation;

	// Mapping relationship
	@OneToMany(targetEntity = BugEntity.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "bug_forkey", referencedColumnName = "id")
	private List<BugEntity> bugEntityList;

	@Override
	public String toString() {
		return "EmployeeEntity [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", designation="
				+ designation + "]";
	}

	public EmployeeEntity(int id, @NotNull(message = "firstName is mandatory") String firstName,
			@NotNull(message = "lastName is mandatory") String lastName,
			@NotNull(message = "designation is mandatory") String designation) { // parameterized constructor
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.designation = designation;
	}

	public EmployeeEntity() { // no arg constructor
		super();
	}

	// Getters and setters
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
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public List<BugEntity> getBugEntityList() {
		return bugEntityList;
	}

	public void setBugEntityList(List<BugEntity> bugEntityList) {
		this.bugEntityList = bugEntityList;
	}

}
