package com.prosky.employeesBook;

import com.prosky.employeesBook.model.Employee;
import com.prosky.employeesBook.service.employeeBook.EmployeesBookService;
import com.prosky.employeesBook.service.employeeBook.EmployeesBookServiceImpl;
import org.junit.jupiter.api.Test;

import java.util.Collection;
import java.util.List;
import java.util.Map;

import static com.prosky.employeesBook.EmployeeServiceTestConstants.*;
import static org.junit.jupiter.api.Assertions.*;

public class EmployeesBookServiceTest {
    private EmployeesBookService out = new EmployeesBookServiceImpl();

    @Test
    public void shouldReturnAddedEmployeeWhenNameAndDepartmentAndSalaryIsCorrect() {
        Employee expected = new Employee(FULL_NAME_ONE, DEPARTMENT_ONE, SALARY_MIN);
        assertEquals(0, out.getAllEmployees().size());

        Employee actual = out.addEmployee(FULL_NAME_ONE, DEPARTMENT_ONE, SALARY_MIN);

        assertEquals(1, out.getAllEmployees().size());
    }

    @Test
    public void shouldReturnRemoteEmployeeWhenIdAndNameIsCorrect() {
        Employee expected = out.addEmployee(FULL_NAME_ONE, DEPARTMENT_ONE, SALARY_MIN);
        assertEquals(1, out.getAllEmployees().size());

        String actual = out.removeEmployee(expected.getId(), FULL_NAME_ONE);

        assertEquals(0, out.getAllEmployees().size());
    }

    @Test
    public void shouldReturnFoundEmployeeWhenIdAndNameIsCorrect() {
        Employee expected = out.addEmployee(FULL_NAME_ONE, DEPARTMENT_ONE, SALARY_MIN);
        assertEquals(1, out.getAllEmployees().size());

        String actual = out.findEmployee(expected.getId(), FULL_NAME_ONE);

        assertEquals(1, out.getAllEmployees().size());
    }

    @Test
    public void shouldReturnListAllEmployees() {
        Employee expected = out.addEmployee(FULL_NAME_ONE, DEPARTMENT_ONE, SALARY_MIN);
        assertEquals(1, out.getAllEmployees().size());

        Map<Integer, Employee> actual = out.getAllEmployees();

        assertEquals(1, out.getAllEmployees().size());
    }

    @Test
    public void shouldThrowEmployeeNotFoundExceptionWhenDepartmentIsEmpty() {

    }
}
