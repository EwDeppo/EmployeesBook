package com.prosky.employeesBook.service.department;

import com.prosky.employeesBook.model.Employee;
import com.prosky.employeesBook.service.employeeBook.EmployeesBookService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.*;

import static java.util.stream.Collectors.groupingBy;

@Service
@RequiredArgsConstructor
public class DepartmentServiceImpl implements DepartmentService {

    private final EmployeesBookService employeesBookService;

    @Override
    public Map<Integer, List<Employee>> getAllEmployeesDepartment(Integer department) {
        return employeesBookService.getAllEmployees().values().stream()
                .collect(groupingBy(Employee::getDepartment));
    }

    @Override
    public Employee getSalaryByValue(Integer department, String value) {
        if (Objects.nonNull(value) && "min".equals(value)) {
            return getMinSalaryDepartment(department);
        } else {

            return getMaxSalaryDepartment(department);
        }
    }

    private Employee getMinSalaryDepartment(Integer department) {
        return employeesBookService.getAllEmployees().values().stream()
                .filter(e -> e.getDepartment().equals(department))
                .min(Comparator.comparingInt(Employee::getSalary))
                .orElse(null);
    }

    private Employee getMaxSalaryDepartment(Integer department) {
        return employeesBookService.getAllEmployees().values().stream()
                .filter(e -> e.getDepartment().equals(department))
                .max(Comparator.comparingInt(Employee::getSalary))
                .orElse(null);
    }
}
