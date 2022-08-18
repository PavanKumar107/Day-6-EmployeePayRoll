package com.bl.employeepayrollapp.repository;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bl.employeepayrollapp.model.EmployeeModel;

public interface EmployeeRepository extends JpaRepository<EmployeeModel, Long> {
	Optional<EmployeeModel> findByEmailId(String email);
}
