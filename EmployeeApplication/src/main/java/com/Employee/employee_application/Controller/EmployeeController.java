package com.Employee.employee_application.Controller;

import com.Employee.employee_application.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeService empService;

    @GetMapping("/")
    public String viewHomePage(){
        return "Hello Java";
    }
}
