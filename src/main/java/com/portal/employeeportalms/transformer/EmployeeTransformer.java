package com.portal.employeeportalms.transformer;

import com.portal.employeeportalms.dto.EmployeeDTO;
import com.portal.employeeportalms.entity.Employee;

import java.util.List;

public interface EmployeeTransformer {

    Employee transform(EmployeeDTO employeeDTO);

    EmployeeDTO transform(Employee employee);

    List<EmployeeDTO> transform(List<Employee> employees);
}
