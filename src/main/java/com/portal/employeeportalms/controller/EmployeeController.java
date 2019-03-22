package com.portal.employeeportalms.controller;

import com.portal.employeeportalms.dto.EmployeeDTO;
import com.portal.employeeportalms.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;

import static java.util.Collections.*;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/{employeeId}")
    public EmployeeDTO get(@PathVariable("employeeId") Long employeeId){
        return employeeService.get(employeeId);
    }

    @PostMapping
    public EmployeeDTO register(@RequestBody EmployeeDTO employeeDTO){
        return employeeService.register(employeeDTO);
    }

    @GetMapping("/all")
    public List<EmployeeDTO> all(){
        return employeeService.getAll();
    }
}
