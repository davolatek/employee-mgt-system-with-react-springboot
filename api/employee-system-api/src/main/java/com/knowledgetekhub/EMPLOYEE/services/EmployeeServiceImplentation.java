package com.knowledgetekhub.EMPLOYEE.services;


import com.knowledgetekhub.EMPLOYEE.entity.EmployeeEntity;
import com.knowledgetekhub.EMPLOYEE.models.EmployeeModel;
import com.knowledgetekhub.EMPLOYEE.repository.EmployeeRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class EmployeeServiceImplentation implements EmployeeService {

    private final EmployeeRepository employeeRepository;

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

    @Override
    public List<EmployeeModel> getAllEmployees() {
        List<EmployeeEntity> employeeEntities = employeeRepository.findAll();

        List<EmployeeModel> employee = employeeEntities.stream().map(emp -> new EmployeeModel(emp.getId(), emp.getFirstName(), emp.getLastName(), emp.getEmailId()
        )).collect(Collectors.toList());
        return employee;
    }

    @Override
    public boolean deleteEmployee(long id) {
        EmployeeEntity employee = employeeRepository.findById(id).get();
        employeeRepository.delete(employee);
        return true;
    }


}
