package com.project.BugTracker.Entity;

import java.time.LocalDate;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

//Class declaration
@Entity
public class BugEntity {

	@Id // Primary key
	@GeneratedValue // auto_increment for primary key
	private int id;

	@NotNull(message = "bugStatus is mandatory") // Validations
	private String bugStatus;

	@NotNull(message = "description is mandatory") // Validations
	private String description;

	@NotNull(message = "createdBy is mandatory") // Validations
	private String createdBy;

	@NotNull(message = "createdDate is mandatory") // Validations
	private LocalDate createdDate;

	@Override
	public String toString() {
		return "BugEntity [id=" + id + ", bugStatus=" + bugStatus + ", description=" + description + ", createdBy="
				+ createdBy + ", createdDate=" + createdDate + "]";
	}

	public BugEntity(int id, @NotNull(message = "bugStatus is mandatory") String bugStatus,
			@NotNull(message = "description is mandatory") String description,
			@NotNull(message = "createdBy is mandatory") String createdBy,
			@NotNull(message = "createdDate is mandatory") LocalDate createdDate) { // parameterized constructor
		super();
		this.id = id;
		this.bugStatus = bugStatus;
		this.description = description;
		this.createdBy = createdBy;
		this.createdDate = createdDate;
	}

	public BugEntity() { // no arg constructor
		super();
	}

	// getters and setters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBugStatus() {
		return bugStatus;
	}

	public void setBugStatus(String bugStatus) {
		this.bugStatus = bugStatus;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public LocalDate getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(LocalDate createdDate) {
		this.createdDate = createdDate;
	}

}
