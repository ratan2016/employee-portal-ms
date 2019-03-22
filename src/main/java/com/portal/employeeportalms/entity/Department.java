package com.portal.employeeportalms.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@Table(name = "DEPARTMENT")
public class Department implements Serializable {
    @Id
    @Column(name="DEPT_ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "DEPT_CODE")
    private String departmentCode;

    @Column(name="DEPT_NAME")
    private String departmentName;
}
