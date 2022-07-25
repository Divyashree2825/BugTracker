package com.project.BugTracker.ServiceImpl;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.project.BugTracker.DAO.AdminRepository;
import com.project.BugTracker.Entity.AdminEntity;
import com.project.BugTracker.Exception.AdminNotFoundException;
import com.project.BugTracker.Service.AdminService;

@Service
public class AdminServiceImpl implements AdminService {

	@Autowired
	private AdminRepository adminRepo;

	// Get all admin details
	@Override
	public List<AdminEntity> getAllAdmin() {
		return adminRepo.findAll();
	}

	// Get admin by id
	@Override
	public Optional<AdminEntity> getAdmin(int id) throws AdminNotFoundException {
		try {
			Optional<AdminEntity> adminData = adminRepo.findById(id);
			if (!adminData.isEmpty()) {
				return adminRepo.findById(id);
			} else {
				throw new AdminNotFoundException("Admin Data not found");
			}
		} catch (Exception e) {
			throw new AdminNotFoundException("Admin Data not found");
		}
	}

	// Add admin details
	@Override
	public AdminEntity addAdmin(AdminEntity adminEntity) {
		return adminRepo.save(adminEntity);
	}

	// Delete admin details
	@Override
	public Optional<AdminEntity> deleteAdmin(int id) throws AdminNotFoundException {

		try {
			Optional<AdminEntity> adminData = adminRepo.findById(id);
			if (!adminData.isEmpty()) {
				adminRepo.deleteById(id);
				return adminData;
			} else {
				throw new AdminNotFoundException("Admin Data not found");
			}
		} catch (Exception e) {
			throw new AdminNotFoundException("Admin Data not found");
		}
	}

	// Update admin details
	@Override
	public AdminEntity updateAdmin(int id, AdminEntity adminEntity) throws AdminNotFoundException {
		try {
			Optional<AdminEntity> adminData = adminRepo.findById(id);
			if (!adminData.isEmpty()) {
				adminEntity.setId(id);
				return adminRepo.save(adminEntity);
			} else {
				throw new AdminNotFoundException("Admin Data not found");
			}
		} catch (Exception e) {
			throw new AdminNotFoundException("Admin Data not found");
		}
	}

}
