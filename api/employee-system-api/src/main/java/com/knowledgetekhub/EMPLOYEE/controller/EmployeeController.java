package com.knowledgetekhub.EMPLOYEE.controller;

import com.knowledgetekhub.EMPLOYEE.entity.EmployeeEntity;
import com.knowledgetekhub.EMPLOYEE.services.EmployeeService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class EmployeeController {

    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @PostMapping("/employee")
    public EmployeeEntity createEmployee(@RequestBody EmployeeEntity employee){
       return employeeService.createEmployee(employee);
    }


}
