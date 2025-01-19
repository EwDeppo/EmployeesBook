package com.prosky.employeesBook.service.employee;

import com.prosky.employeesBook.model.Employee;

import java.util.Map;

public interface EmployeeService {

    Map<Integer, Employee> getEmployees();

    Integer getSalarySum();

    Employee getSalaryMin();

    Employee getSalaryMax();
}
