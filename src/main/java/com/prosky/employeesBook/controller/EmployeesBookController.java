package com.prosky.employeesBook.controller;

import com.prosky.employeesBook.model.Employee;
import com.prosky.employeesBook.service.employeeBook.EmployeesBookService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/employees/book")
public class EmployeesBookController {
    private final EmployeesBookService employeesBookService;

    @GetMapping(path = "/add")
    public Employee addEmployee(@RequestParam("fullName") String fullName,
                                @RequestParam("department") Integer department,
                                @RequestParam("salary") Integer salary) {
        return employeesBookService.addEmployee(fullName, department, salary);
    }

    @GetMapping(path = "/remove")
    public String removeEmployee(@RequestParam("id") Integer integerId,
                                 @RequestParam("fullName") String fullName) {
        return employeesBookService.removeEmployee(integerId, fullName);
    }

    @GetMapping(path = "/find")
    public String findEmployee(@RequestParam("id") Integer id,
                               @RequestParam("fullName") String fullName) {
        return employeesBookService.findEmployee(id, fullName);
    }
}
