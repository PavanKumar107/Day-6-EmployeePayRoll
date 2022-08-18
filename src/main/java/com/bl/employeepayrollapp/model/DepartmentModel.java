package com.bl.employeepayrollapp.model;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import com.bl.employeepayrollapp.dto.DepartmentDTO;
import lombok.Data;

@Entity
@Table(name = "departmenttable")
@Data
public class DepartmentModel {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long departmentId;
	private String departmentName;
	private String departmentemail;
	private LocalDateTime createdTime;
	private LocalDateTime updatedTime;

	public DepartmentModel() {

	}

	public DepartmentModel(DepartmentDTO dto) {
		this.departmentName = dto.getDepartmentName();
		this.departmentemail = dto.getDepartmentemail();

	}
}
