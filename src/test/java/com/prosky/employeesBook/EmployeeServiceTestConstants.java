package com.prosky.employeesBook;

import com.prosky.employeesBook.model.Employee;
import lombok.experimental.UtilityClass;

import java.util.List;
import java.util.Map;
import java.util.Set;

import static java.util.stream.Collectors.groupingBy;

@UtilityClass
public class EmployeeServiceTestConstants {
    public String FULL_NAME_ONE = "Ivan Ivanov";
    public Integer DEPARTMENT_ONE = 1;
    public Integer SALARY_MIN = 10;
    public String FULL_NAME_TWO = "Oleg Olegov";
    public Integer DEPARTMENT_TWO = 2;
    public Integer SALARY_MAX = 20;
    public Integer SALARY_SUM = 30;
    public Employee MIN_SALARY_EMPLOYEE = new Employee(FULL_NAME_ONE, DEPARTMENT_ONE, SALARY_MIN);
    public Employee MAX_SALARY_EMPLOYEE = new Employee(FULL_NAME_TWO, DEPARTMENT_TWO, SALARY_MAX);
    public Map<Integer, Employee> EMPLOYEE_MAP = Map.of(
            DEPARTMENT_ONE, MIN_SALARY_EMPLOYEE,
            DEPARTMENT_TWO, MAX_SALARY_EMPLOYEE);

    public Map<Integer, List<Employee>> DEPARTMENT_MAP = EMPLOYEE_MAP.values().stream()
            .collect(groupingBy(Employee :: getDepartment));
}

