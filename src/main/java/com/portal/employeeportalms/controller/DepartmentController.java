package com.portal.employeeportalms.controller;

import com.portal.employeeportalms.dto.DepartmentDTO;
import com.portal.employeeportalms.service.DepartmentService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/departments")
@Api(value = "/departments", description = "APIs for Department")
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    @GetMapping
    @ApiOperation(value = "Fetch All Departments for Employment", response = ArrayList.class)
    public List<DepartmentDTO> getAll() {
        return departmentService.getAll();
    }
}
