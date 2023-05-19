package com.geekster.employee.controller;

import com.geekster.employee.model.Address;
import com.geekster.employee.model.Employee;
import com.geekster.employee.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/employee")
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;
    @GetMapping(value = "/home")
    public String home(){
        return "this is home for testing employee controller";
    }
    @GetMapping(value = "/all")
    public Iterable<Employee> getall(){
        return employeeService.getall();
    }
    @GetMapping(value = "getbyid/{id}")
    public Optional<Employee> getbyid(@PathVariable Long id){
        return employeeService.getbyid(id);
    }

    @PostMapping(value = "employee")
    public void addemployee(@RequestBody Employee employee){
        employeeService.addemployee(employee);
    }
    @DeleteMapping(value = "deletebyid/{id}")
    public String deletebyid(@PathVariable Long id){
        return employeeService.deletebyid(id);
    }

    @PutMapping(value = "/updatebyid/{id}/{firstName}")
    public void updatebyid(@PathVariable Long id,@PathVariable String firstName){
        employeeService.updatebyid(id,firstName);
    }
}
