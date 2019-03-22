package com.portal.employeeportalms.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Data
@Entity
@Table(name="EMPLOYEE")
public class Employee implements Serializable {
    @Id
    @Column(name="EMPLOYEE_ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="FIRST_NAME")
    private String firstName;

    @Column(name="LAST_NAME")
    private String lastName;

    @Column(name="GENDER")
    private String gender;

    @Column(name="DOB")
    @Temporal(TemporalType.DATE)
    private Date dateOfBirth;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinTable(name = "EMPLOYEE_DEPARTMENT",
            joinColumns = { @JoinColumn(name = "EMPLOYEE_ID", referencedColumnName = "EMPLOYEE_ID") },
            inverseJoinColumns = { @JoinColumn(name = "DEPT_ID", referencedColumnName = "DEPT_ID") })
    private Department department;

}
