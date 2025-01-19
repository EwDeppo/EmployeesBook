package com.prosky.employeesBook.service.employeeBook;

import com.prosky.employeesBook.model.Employee;
import org.springframework.stereotype.Repository;

import java.util.Map;

@Repository
public interface EmployeesBookService {

    Employee addEmployee(String fullName, Integer department, Integer salary);

    String removeEmployee(Integer id, String fullName);

    String findEmployee(Integer id, String fullName);

    Map<Integer, Employee> getAllEmployees();
}
