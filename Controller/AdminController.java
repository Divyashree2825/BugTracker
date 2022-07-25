package com.project.BugTracker.Controller;

import java.util.List;
import java.util.Optional;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.project.BugTracker.Entity.AdminEntity;
import com.project.BugTracker.Exception.AdminNotFoundException;
import com.project.BugTracker.Service.AdminService;

@RestController
@CrossOrigin("http://localhost:3000")
public class AdminController {

	@Autowired
	private AdminService adminServices;

	// Get all admin details
	@GetMapping("/admin")
	public List<AdminEntity> getAllAdmin() {
		return adminServices.getAllAdmin();
	}

	// Get admin details by id
	@GetMapping("admin/{id}")
	public Optional<AdminEntity> getAdminById(@PathVariable int id) throws AdminNotFoundException {
		return adminServices.getAdmin(id);
	}

	// Add admin details
	@PostMapping("admin")
	public AdminEntity addAdmin(@Valid @RequestBody AdminEntity adminEntity) {
		return adminServices.addAdmin(adminEntity);
	}

	// Update admin details
	@PutMapping("admin/{id}")
	public AdminEntity updateAdmin(@PathVariable int id, @Valid @RequestBody AdminEntity adminEntity)
			throws AdminNotFoundException {
		return adminServices.updateAdmin(id, adminEntity);
	}

	// Delete admin details
	@DeleteMapping("admin/{id}")
	public Optional<AdminEntity> deleteAdmin(@PathVariable int id) throws AdminNotFoundException {
		return adminServices.deleteAdmin(id);
	}

}
