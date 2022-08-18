package com.bl.employeepayrollapp.dto;

import java.time.LocalDateTime;

import lombok.Data;

@Data
public class DepartmentDTO {
	private Long departmentId;
	private String departmentName;
	private String departmentemail;
	private LocalDateTime createdTime;
	private LocalDateTime updatedTime;
}
