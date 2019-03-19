package com.portal.employeeportalms.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Date;

@Data
@Entity
@Table(name="EMPLOYEE")
public class Employee {
    @Id
    @Column(name="EMPLOYEE_ID")
    private Long id;

    @Column(name="FIRST_NAME")
    private String firstName;

    @Column(name="LAST_NAME")
    private String lastName;

    @Column(name="GENDER")
    private String gender;

    @Column(name="DOB")
    private Date dateOfBirth;

    @Column(name="DEPARTMENT")
    private String department;

}
