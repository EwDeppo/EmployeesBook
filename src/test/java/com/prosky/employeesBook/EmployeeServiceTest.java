package com.prosky.employeesBook;

import com.prosky.employeesBook.service.employee.EmployeeServiceImpl;
import com.prosky.employeesBook.service.employeeBook.EmployeesBookService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertIterableEquals;
import static com.prosky.employeesBook.EmployeeServiceTestConstants.*;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class EmployeeServiceTest {

    @Mock
    private EmployeesBookService employeesBookService;

    @InjectMocks
    private EmployeeServiceImpl out;

    @Test
    public void shouldReturnAllEmployee() {
        when(employeesBookService.getAllEmployees()).thenReturn(EMPLOYEE_MAP);
        assertEquals(EMPLOYEE_MAP, out.getEmployees());
    }

    @Test
    public void shouldReturnSumSalary() {
        when(employeesBookService.getAllEmployees()).thenReturn(EMPLOYEE_MAP);
        assertEquals(SALARY_SUM, out.getSalarySum());
    }

    @Test
    public void shouldReturnEmployeeWithMinSalary() {
        when(employeesBookService.getAllEmployees()).thenReturn(EMPLOYEE_MAP);
        assertEquals(MIN_SALARY_EMPLOYEE, out.getSalaryMin());
    }

    @Test
    public void shouldReturnEmployeeWithMaxSalary() {
        when(employeesBookService.getAllEmployees()).thenReturn(EMPLOYEE_MAP);
        assertEquals(MAX_SALARY_EMPLOYEE, out.getSalaryMax());
    }
}
