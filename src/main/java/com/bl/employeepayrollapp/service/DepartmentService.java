package com.bl.employeepayrollapp.service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.bl.employeepayrollapp.dto.DepartmentDTO;
import com.bl.employeepayrollapp.exception.EmployeeNotFoundException;
import com.bl.employeepayrollapp.model.DepartmentModel;
import com.bl.employeepayrollapp.repository.DepartmentRepository;

@Service
public class DepartmentService implements IDepartmentService {

	@Autowired
	DepartmentRepository departmentRepository;

	@Override
	public DepartmentModel addDepartment(DepartmentDTO departmentDTO) {
		DepartmentModel model = new DepartmentModel(departmentDTO);
		model.setCreatedTime(LocalDateTime.now());
		departmentRepository.save(model);
		return model;
	}

	@Override
	public DepartmentModel updateDepartment(DepartmentDTO departmentDTO, Long departmentId) {
		Optional<DepartmentModel>isDepartmentPresent = departmentRepository.findById(departmentId);
		if (isDepartmentPresent.isPresent()) {
			isDepartmentPresent.get().setDepartmentName(departmentDTO.getDepartmentName());
			isDepartmentPresent.get().setUpdatedTime(LocalDateTime.now());
			departmentRepository.save(isDepartmentPresent.get());
			return isDepartmentPresent.get();
		} else {
			throw new EmployeeNotFoundException(400, "Department is not found with this ID");
		}
	}

	@Override
	public List<DepartmentModel> getAllDepartments() {
		List<DepartmentModel> isDepartmentPresent = departmentRepository.findAll();
		if (isDepartmentPresent.size() > 0) {
			return isDepartmentPresent;
		} else {
			throw new EmployeeNotFoundException(400, "No Departments Found");
		}
	}

	@Override
	public DepartmentModel deleteDepartment(Long id) {
		Optional<DepartmentModel> isDepartmentIdPresent = departmentRepository.findById(id);
		if ( isDepartmentIdPresent.isPresent()) {
			departmentRepository.delete( isDepartmentIdPresent.get());
			return  isDepartmentIdPresent.get();
		} 
		else {
			throw new EmployeeNotFoundException(400, "Department is not found");
		}
	}
}