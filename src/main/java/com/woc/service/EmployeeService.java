package com.woc.service;

import com.woc.dto.Employee;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
    public Employee fetchEmployee(String email){
        if(email.length() == 0){
            throw new RuntimeException("Email Should not be blank");
        }
        //fetch the data for given email from db
        Employee employee = new Employee();
        employee.setId(500);
        employee.setName("kashish");
        employee.setEmail("kashish@gmail.com");
        employee.setMobile(98798797999l);

        return employee;
    }
}
