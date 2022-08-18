package com.bl.employeepayrollapp.service;

import java.util.List;
import java.util.Optional;

import com.bl.employeepayrollapp.dto.EmployeeDTO;
import com.bl.employeepayrollapp.model.EmployeeModel;
import com.bl.employeepayrollapp.util.Response;

public interface IEmployeeService {
	EmployeeModel addemployee(EmployeeDTO employeeDTO,Long departmentId);

	List<EmployeeModel> getEmpData(String token);

	EmployeeModel deleteEmployee(Long id);

	Response login(String email, String password);

	EmployeeModel updateemployee(EmployeeDTO employeeDTO, long id, Long departmentId);
	
	Optional<EmployeeModel> getEmpById(Long id);
	
}
