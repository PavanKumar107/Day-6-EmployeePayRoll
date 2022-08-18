package com.bl.employeepayrollapp.service;

import java.util.List;

import com.bl.employeepayrollapp.dto.DepartmentDTO;
import com.bl.employeepayrollapp.model.DepartmentModel;

public interface IDepartmentService {

	DepartmentModel addDepartment(DepartmentDTO departmentDTO);

	DepartmentModel updateDepartment(DepartmentDTO departmentDTO,Long departmentId);

	List<DepartmentModel> getAllDepartments();

	DepartmentModel deleteDepartment(Long id);
}
