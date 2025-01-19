package com.prosky.employeesBook;

import com.prosky.employeesBook.model.Employee;
import com.prosky.employeesBook.service.department.DepartmentServiceImpl;
import com.prosky.employeesBook.service.employeeBook.EmployeesBookService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Collection;

import static com.prosky.employeesBook.EmployeeServiceTestConstants.*;
import static java.util.Collections.singletonList;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class DepartmentServiceTest {

    @Mock
    private EmployeesBookService employeesBookService;

    @InjectMocks
    private DepartmentServiceImpl out;

    @Test
    public void shouldReturnAllEmployeesWhenByDepartment() {
        when(employeesBookService.getAllEmployees()).thenReturn(EMPLOYEE_MAP);
        assertEquals(DEPARTMENT_MAP, out.getAllEmployeesDepartment(DEPARTMENT_ONE));
    }

    @Test
    public void shouldReturnEmployeeWithMinSalaryWhenByDepartment() {
        when(employeesBookService.getAllEmployees()).thenReturn(EMPLOYEE_MAP);
        assertEquals(MIN_SALARY_EMPLOYEE, out.getSalaryByValue(DEPARTMENT_ONE, "min"));
    }
}
