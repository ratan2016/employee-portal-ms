package com.portal.employeeportalms.service;

import com.portal.employeeportalms.dto.DepartmentDTO;
import com.portal.employeeportalms.repository.DepartmentRepository;
import com.portal.employeeportalms.transformer.DepartmentTransformer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class DepartmentServiceImpl implements DepartmentService {
    @Autowired
    private DepartmentRepository repository;

    @Autowired
    private DepartmentTransformer transformer;

    @Override
    public List<DepartmentDTO> getAll() {
        return transformer.transform(repository.findAll());
    }
}
