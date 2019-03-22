package com.portal.employeeportalms.transformer;

import com.portal.employeeportalms.dto.DepartmentDTO;
import com.portal.employeeportalms.entity.Department;

import java.util.List;

public interface DepartmentTransformer {
    DepartmentDTO transform(Department department);

    List<DepartmentDTO> transform(List<Department> departments);

    Department transform(DepartmentDTO departmentDTO);
}
