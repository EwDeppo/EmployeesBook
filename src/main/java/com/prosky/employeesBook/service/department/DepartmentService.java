package com.prosky.employeesBook.service.department;

import com.prosky.employeesBook.model.Employee;

import java.util.List;
import java.util.Map;

public interface DepartmentService {

    Map<Integer, List<Employee>> getAllEmployeesDepartment(Integer department);

    Employee getSalaryByValue(Integer department, String value);
}
