package com.example.awsrds.controller;

import com.example.awsrds.entity.Employee;
import com.example.awsrds.repository.EmpRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    private EmpRepository empRepository;

    @PostMapping("/addEmp")
    public Employee addEmployee(@RequestBody Employee employee) {
        System.out.println("employee: "+employee.getEmpId());
        empRepository.save(employee);
        return employee;
    }

    @GetMapping("/getEmp")
    public List<Employee> getEmployee() {
        return empRepository.findAll();
    }
}
