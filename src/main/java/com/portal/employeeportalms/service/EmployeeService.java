package com.portal.employeeportalms.service;

import com.portal.employeeportalms.dto.EmployeeDTO;

import java.util.List;

public interface EmployeeService {

    EmployeeDTO register(EmployeeDTO employeeDTO);

    EmployeeDTO get(Long employeeId);

    List<EmployeeDTO> getAll();
}
