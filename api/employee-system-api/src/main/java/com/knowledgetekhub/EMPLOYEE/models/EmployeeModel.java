package com.knowledgetekhub.EMPLOYEE.models;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeModel {

    private long id;
    private String firstName;
    private String lastName;
    private String emailId;
}
