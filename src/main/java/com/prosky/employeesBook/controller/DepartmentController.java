package com.prosky.employeesBook.controller;

import com.prosky.employeesBook.model.Employee;
import com.prosky.employeesBook.service.department.DepartmentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequiredArgsConstructor
@RequestMapping("/department")
public class DepartmentController {
    private final DepartmentService departmentService;

    @GetMapping(path = "/all")
    public Map<Integer, List<Employee>> getAllEmployeesDepartment(@RequestParam("department")
                                                                  Integer department) {
        return departmentService.getAllEmployeesDepartment(department);
    }

    @GetMapping(path = "/salary")
    public Employee getSalaryByValue(@RequestParam("department") Integer department,
                                     @RequestParam(name = "min",
                                             required = false,
                                             defaultValue = "max") String value) {
        return departmentService.getSalaryByValue(department, value);
    }
}
