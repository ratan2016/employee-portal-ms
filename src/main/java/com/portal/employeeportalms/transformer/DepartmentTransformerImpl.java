package com.portal.employeeportalms.transformer;

import com.portal.employeeportalms.dto.DepartmentDTO;
import com.portal.employeeportalms.entity.Department;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

import static java.util.Collections.emptyList;
import static org.hibernate.internal.util.collections.CollectionHelper.isNotEmpty;

@Component
public class DepartmentTransformerImpl implements DepartmentTransformer {
    @Override
    public DepartmentDTO transform(Department department) {
        DepartmentDTO departmentDTO=new DepartmentDTO();
        departmentDTO.setId(department.getId());
        departmentDTO.setDepartmentCode(department.getDepartmentCode());
        departmentDTO.setDepartmentName(department.getDepartmentName());
        return departmentDTO;
    }

    @Override
    public List<DepartmentDTO> transform(List<Department> departments) {
        if(isNotEmpty(departments)){
         return  departments.stream().map(department -> transform(department))
            .collect(Collectors.toList());
        }
        return emptyList();
    }

    @Override
    public Department transform(DepartmentDTO departmentDTO) {
        Department department=new Department();
        department.setId(departmentDTO.getId());
        department.setDepartmentCode(departmentDTO.getDepartmentCode());
        department.setDepartmentName(departmentDTO.getDepartmentName());
        return department;
    }
}
