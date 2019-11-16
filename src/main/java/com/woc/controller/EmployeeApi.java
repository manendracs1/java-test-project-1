package com.woc.controller;

import com.woc.dto.Employee;
import com.woc.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeApi {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/api/health/check")
    public ResponseEntity<?> healthCheck(){
        return new ResponseEntity<String>("fine", HttpStatus.OK);
    }

    @GetMapping("/api/employee")
    public ResponseEntity<?> fetchEmployee(@RequestParam("email") String email){
        Employee employee = employeeService.fetchEmployee(email);
        return new ResponseEntity<Employee>(employee, HttpStatus.OK);
    }
}
