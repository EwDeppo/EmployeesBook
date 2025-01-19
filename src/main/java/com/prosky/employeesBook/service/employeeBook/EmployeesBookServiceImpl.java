package com.prosky.employeesBook.service.employeeBook;

import com.prosky.employeesBook.exception.EmployeeAlreadyAddedException;
import com.prosky.employeesBook.exception.EmployeeNotFoundException;
import com.prosky.employeesBook.model.Employee;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
@RequiredArgsConstructor
public class EmployeesBookServiceImpl implements EmployeesBookService {
    private final HashMap<Integer, Employee> employees = new HashMap<>();

    @Override
    public Employee addEmployee(String fullName, Integer department, Integer salary) {
        Employee employee = new Employee(fullName, department, salary);
        if (employees.containsKey(employee.getId())) {
            throw new EmployeeAlreadyAddedException();
        }
        employees.put(employee.getId(), employee);
        return employee;
    }

    @Override
    public String removeEmployee(Integer id, String fullName) {
        if (!employees.containsKey(id)) {
            throw new EmployeeNotFoundException();
        }
        employees.remove(id);
        return "Сотрудник " + id.toString() + " удален";
    }

    @Override
    public String findEmployee(Integer id, String fullName) {
        if (!employees.containsKey(id)) {
            throw new EmployeeNotFoundException();
        }
        return employees.values().stream()
                .filter(e -> e.getId().equals(id))
                .toList().toString();
    }

    @Override
    public Map<Integer, Employee> getAllEmployees() {
        return employees;
    }
}
