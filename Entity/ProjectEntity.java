package com.project.BugTracker.Entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotNull;

// Class declaration
@Entity
public class ProjectEntity {

	@Id // primary key
	@GeneratedValue // Auto_increment for primary key
	@NotNull(message = "projectId is mandatory") // Validations
	private int projectId;

	@NotNull(message = "projectName is mandatory") // Validations
	private String projectName;

	@NotNull(message = "projectType is mandatory") // Validations
	private String projectType;

	@NotNull(message = "technology is mandatory") // Validations
	private String technology;

	@NotNull(message = "client is mandatory") // Validations
	private String client;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "bugId", referencedColumnName = "id")
	private BugEntity bugEntity;
	
	public ProjectEntity() { // no arg constructor
		super();
	}

	public ProjectEntity(@NotNull(message = "projectId is mandatory") int projectId,
			@NotNull(message = "projectName is mandatory") String projectName,
			@NotNull(message = "projectType is mandatory") String projectType,
			@NotNull(message = "technology is mandatory") String technology,
			@NotNull(message = "client is mandatory") String client) { // parameterized constructor
		super();
		this.projectId = projectId;
		this.projectName = projectName;
		this.projectType = projectType;
		this.technology = technology;
		this.client = client;
	}

	// Getters and setters
	public int getProjectId() {
		return projectId;
	}

	public void setProjectId(int projectId) {
		this.projectId = projectId;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public String getProjectType() {
		return projectType;
	}

	public void setProjectType(String projectType) {
		this.projectType = projectType;
	}

	public String getTechnology() {
		return technology;
	}

	public void setTechnology(String technology) {
		this.technology = technology;
	}

	public String getClient() {
		return client;
	}

	public void setClient(String client) {
		this.client = client;
	}

	@Override
	public String toString() {
		return "ProjectEntity [projectId=" + projectId + ", projectName=" + projectName + ", projectType=" + projectType
				+ ", technology=" + technology + ", client=" + client + "]";
	}
	
	public void setBugEntity(BugEntity bugEntity) {
		this.bugEntity = bugEntity;
	}


}
