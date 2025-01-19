package com.prosky.employeesBook.controller;

import com.prosky.employeesBook.model.Employee;
import com.prosky.employeesBook.service.employee.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequiredArgsConstructor
@RequestMapping("/employee")
public class EmployeeController {
    private final EmployeeService employeeService;

    @GetMapping(path = "/sum")
    Integer salarySum() {
        return employeeService.getSalarySum();
    }

    @GetMapping(path = "/min")
    public Employee salaryMin() {
        return employeeService.getSalaryMin();
    }

    @GetMapping(path = "/max")
    public Employee salaryMax() {
        return employeeService.getSalaryMax();
    }

    @GetMapping(path = "/get")
    public Map<Integer, Employee> getEmployees() {
        return employeeService.getEmployees();
    }
}
