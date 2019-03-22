package com.portal.employeeportalms.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.portal.employeeportalms.common.DateToStringSerializer;
import com.portal.employeeportalms.common.StringToDateDeserializer;
import lombok.Data;
import lombok.ToString;

import java.util.Date;


@Data
@ToString
@JsonIgnoreProperties(ignoreUnknown = true)
public class EmployeeDTO {

    private Long id;

    private String firstName;

    private String lastName;

    private String gender;

    @JsonDeserialize(using = StringToDateDeserializer.class)
    @JsonSerialize(using = DateToStringSerializer.class)
    private Date dateOfBirth;

    private DepartmentDTO department;


}
