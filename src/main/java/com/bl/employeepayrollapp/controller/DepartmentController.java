package com.bl.employeepayrollapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.bl.employeepayrollapp.dto.DepartmentDTO;
import com.bl.employeepayrollapp.model.DepartmentModel;
import com.bl.employeepayrollapp.service.IDepartmentService;

@RestController
@RequestMapping("/department")
public class DepartmentController {

	@Autowired
	IDepartmentService departmentService;

	@PostMapping("/adddepartment")
	public DepartmentModel addDepartment(@RequestBody DepartmentDTO departmentDTO) {
		return departmentService.addDepartment(departmentDTO);
	}

	@PutMapping("/updatedepartment/{id}")
	public DepartmentModel updateDepartment(@RequestBody DepartmentDTO departmentDTO,@PathVariable Long id){
		return departmentService.updateDepartment(departmentDTO,id);
	}

	@GetMapping("/getAlldepartments")
	public List<DepartmentModel> getAllDepartments(){
		return departmentService.getAllDepartments();
	}
	@DeleteMapping("/deletedepartment/{id}")
	public DepartmentModel deleteDepartment(@PathVariable Long id){
		return departmentService.deleteDepartment(id);
	}
}
