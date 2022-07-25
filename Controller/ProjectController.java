package com.project.BugTracker.Controller;

import java.util.List;
import java.util.Optional;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.project.BugTracker.Entity.ProjectEntity;
import com.project.BugTracker.Exception.ProjectNotFoundException;
import com.project.BugTracker.Service.ProjectService;

@RestController
public class ProjectController {

	@Autowired
	private ProjectService projectServices;

	// Get all Project details
	@GetMapping("/project")
	public List<ProjectEntity> getAllProject() {
		return projectServices.getAllProject();
	}

	// Get project by id
	@GetMapping("project/{id}")
	public Optional<ProjectEntity> getProjectById(@PathVariable int id) throws ProjectNotFoundException {
		return projectServices.getProject(id);
	}

	// Add project details
	@PostMapping("project")
	public ProjectEntity addProject(@Valid @RequestBody ProjectEntity projectEntity) {
		return projectServices.addProject(projectEntity);
	}

	// Update project details by id
	@PutMapping("project/{id}")
	public ProjectEntity updateProject(@PathVariable int id, @Valid @RequestBody ProjectEntity projectEntity)
			throws ProjectNotFoundException {
		return projectServices.updateProject(id, projectEntity);
	}

	// Delete project details by id
	@DeleteMapping("project/{id}")
	public Optional<ProjectEntity> deleteProject(@PathVariable int id) throws ProjectNotFoundException {
		return projectServices.deleteProject(id);
	}

}
