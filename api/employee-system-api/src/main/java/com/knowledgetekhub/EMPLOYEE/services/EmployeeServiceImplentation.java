package com.knowledgetekhub.EMPLOYEE.services;


import com.knowledgetekhub.EMPLOYEE.entity.EmployeeEntity;
import com.knowledgetekhub.EMPLOYEE.repository.EmployeeRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImplentation implements EmployeeService {

    private EmployeeRepository employeeRepository;

    public EmployeeServiceImplentation(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public EmployeeEntity createEmployee(EmployeeEntity employee) {
        EmployeeEntity employeeEntity = new EmployeeEntity();

        BeanUtils.copyProperties(employee, employeeEntity);

        employeeRepository.save(employeeEntity);

        return employee;
    }
}
