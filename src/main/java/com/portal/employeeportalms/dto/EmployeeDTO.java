package com.portal.employeeportalms.dto;

import lombok.Data;
import lombok.ToString;

import java.sql.Date;

@Data
@ToString
public class EmployeeDTO {

    private Long id;

    private String firstName;

    private String lastName;

    private String gender;

    private Date dateOfBirth;

    private String department;


}
