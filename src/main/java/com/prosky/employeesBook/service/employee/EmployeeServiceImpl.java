package com.prosky.employeesBook.service.employee;

import com.prosky.employeesBook.model.Employee;
import com.prosky.employeesBook.service.employeeBook.EmployeesBookService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.Map;

@Service
@RequiredArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {

    private final EmployeesBookService employeesBookService;

    @Override
    public Map<Integer, Employee> getEmployees() {
        return employeesBookService.getAllEmployees();
    }

    @Override
    public Integer getSalarySum() {
        return employeesBookService.getAllEmployees().values().stream()
                .mapToInt(Employee::getSalary)
                .sum();
    }

    @Override
    public Employee getSalaryMin() {
        return employeesBookService.getAllEmployees().values().stream()
                .min(Comparator.comparingInt(Employee::getSalary))
                .orElse(null);
    }

    @Override
    public Employee getSalaryMax() {
        return employeesBookService.getAllEmployees().values().stream()
                .max(Comparator.comparingInt(Employee::getSalary))
                .orElse(null);
    }
}
