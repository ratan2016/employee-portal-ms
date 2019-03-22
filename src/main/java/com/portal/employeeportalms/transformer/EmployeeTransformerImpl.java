package com.portal.employeeportalms.transformer;

import com.portal.employeeportalms.dto.EmployeeDTO;
import com.portal.employeeportalms.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.Collections.*;

@Component
public class EmployeeTransformerImpl implements EmployeeTransformer {
    @Autowired
    private DepartmentTransformer departmentTransformer;

    @Override
    public Employee transform(EmployeeDTO employeeDTO) {
        Employee employee = new Employee();
        employee.setId(employeeDTO.getId());
        employee.setFirstName(employeeDTO.getFirstName());
        employee.setLastName(employeeDTO.getLastName());
        employee.setGender(employeeDTO.getGender());
        employee.setDateOfBirth(employeeDTO.getDateOfBirth());
        employee.setDepartment(departmentTransformer.transform(employeeDTO.getDepartment()));
        return employee;
    }

    @Override
    public EmployeeDTO transform(Employee employee) {
        EmployeeDTO employeeDTO = new EmployeeDTO();
        employeeDTO.setId(employee.getId());
        employeeDTO.setFirstName(employee.getFirstName());
        employeeDTO.setLastName(employee.getLastName());
        employeeDTO.setGender(employee.getGender());
        employeeDTO.setDateOfBirth(employee.getDateOfBirth());
        employeeDTO.setDepartment(departmentTransformer.transform(employee.getDepartment()));
        return employeeDTO;
    }

    @Override
    public List<EmployeeDTO> transform(List<Employee> employees) {
        if (!employees.isEmpty()) {
            return employees.stream().map(employee -> {
                return transform(employee);
            }).collect(Collectors.toList());

        }
        return emptyList();
    }
}
