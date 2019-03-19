package com.portal.employeeportalms.controller;

import com.portal.employeeportalms.dto.EmployeeDTO;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;

import static java.util.Collections.*;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    @GetMapping("/{employeeId}")
    public EmployeeDTO get(@PathVariable("employeeId") Long employeeId){
        return null;
    }

    @PostMapping
    public EmployeeDTO register(@RequestBody EmployeeDTO employeeDTO){
        return new EmployeeDTO();
    }

    @GetMapping
    public List<EmployeeDTO> all(){
        return emptyList();
    }
}
