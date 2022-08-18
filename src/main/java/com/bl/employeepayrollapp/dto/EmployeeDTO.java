package com.bl.employeepayrollapp.dto;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

import lombok.Data;

@Data
public class EmployeeDTO{
	@Pattern(regexp = "^[A-Z]{1}[a-zA-Z\\s]{2,}$",message = "First name Invalid")
    private String firstName;
	
	@Pattern(regexp = "^[a-z]{1}[a-zA-Z\\s]{2,}$",message = "last name Invalid")
    private String lastName;
	
	@NotBlank(message = "company name cannot be empty")
    private String companyName;
	
	@NotBlank(message = "mobile number cannot be empty")
    private String mobileNum;
	
    @Min(value = 500,message = "Min salary should be more than 500")
    private long salary;
    
    @NotBlank(message = "department cannot be empty")
    private String department;
    
    private String emailId;
    private String password;
    
    @Pattern(regexp="male|female",message="gender needs to be male or female")
    private String gender;
    
    @NotBlank(message = "note cannot be empty")
    private String note;
    
    @NotBlank(message = "profilepic cannot be empty")
    private String profilePic;
}
