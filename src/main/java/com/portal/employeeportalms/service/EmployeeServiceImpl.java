package com.portal.employeeportalms.service;


import com.portal.employeeportalms.dto.EmployeeDTO;
import com.portal.employeeportalms.entity.Department;
import com.portal.employeeportalms.entity.Employee;
import com.portal.employeeportalms.repository.DepartmentRepository;
import com.portal.employeeportalms.repository.EmployeeRepository;
import com.portal.employeeportalms.transformer.EmployeeTransformer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepository repository;

    @Autowired
    private DepartmentRepository departmentRepository;

    @Autowired
    private EmployeeTransformer transformer;

    @Override
    public EmployeeDTO register(EmployeeDTO employeeDTO) {

        Employee employee = transformer.transform(employeeDTO);
        Department department= departmentRepository.getOne(employee.getDepartment().getId());
        employee.setDepartment(department);
        employee =repository.save(employee);
        return transformer.transform(employee);
    }

    @Override
    public EmployeeDTO get(Long employeeId) {
        EmployeeDTO employeeDTO = null;
        Optional<Employee> employee = repository.findById(employeeId);
        if (employee.isPresent()) {
            employeeDTO = transformer.transform(employee.get());
        }
        return employeeDTO;
    }

    @Override
    public List<EmployeeDTO> getAll() {
        List<Employee> employees = repository.findAll();
        return transformer.transform(employees);
    }
}
