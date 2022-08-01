package com.knowledgetekhub.EMPLOYEE.services;

import com.knowledgetekhub.EMPLOYEE.entity.EmployeeEntity;
import com.knowledgetekhub.EMPLOYEE.models.EmployeeModel;

import java.util.List;

public interface EmployeeService {
    EmployeeEntity createEmployee(EmployeeEntity employee);

    List<EmployeeModel> getAllEmployees();

    boolean deleteEmployee(long id);
}
