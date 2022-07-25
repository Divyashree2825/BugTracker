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

import com.project.BugTracker.Entity.UserEntity;
import com.project.BugTracker.Exception.UserNotFoundException;
import com.project.BugTracker.Service.UserService;

@RestController
public class UserController {

	@Autowired
	private UserService userServices;

	// Get All User details
	@GetMapping("/user")
	public List<UserEntity> getAllUser() {
		return userServices.getAllUser();
	}

	// Get user details by id
	@GetMapping("user/{id}")
	public Optional<UserEntity> getUserById(@PathVariable int id) throws UserNotFoundException {
		return userServices.getUser(id);
	}

	// Add user details
	@PostMapping("user")
	public UserEntity addUser(@Valid @RequestBody UserEntity userEntity) {
		return userServices.addUser(userEntity);
	}

	// Update user details by id
	@PutMapping("user/{id}")
	public UserEntity updateUser(@PathVariable int id, @Valid @RequestBody UserEntity userEntity)
			throws UserNotFoundException {
		return userServices.updateUser(id, userEntity);
	}

	// Delete user details by id
	@DeleteMapping("user/{id}")
	public Optional<UserEntity> deleteUser(@PathVariable int id) throws UserNotFoundException {
		return userServices.deleteUser(id);
	}

}
