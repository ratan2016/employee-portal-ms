package com.portal.employeeportalms.controller;

import com.portal.employeeportalms.dto.EmployeeDTO;
import com.portal.employeeportalms.service.EmployeeService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/employees")
@Api(value = "/employees", description = "APIs for Employee Records")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/{employeeId}")
    @ApiOperation(value = "Fetch Employee by Id", response = EmployeeDTO.class)
    public EmployeeDTO get(@PathVariable("employeeId") Long employeeId) {
        return employeeService.get(employeeId);
    }

    @PostMapping
    @ApiOperation(value = "Register a New Employee", response = EmployeeDTO.class)
    public EmployeeDTO register(@RequestBody EmployeeDTO employeeDTO) {
        return employeeService.register(employeeDTO);
    }

    @GetMapping("/all")
    @ApiOperation(value = "Fetch All Employees", response = ArrayList.class)
    public List<EmployeeDTO> all() {
        return employeeService.getAll();
    }
}
