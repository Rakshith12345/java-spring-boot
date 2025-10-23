package com.example.employeedemo.controller;

import org.springframework.web.bind.annotation.*;
import java.util.List;
import com.example.employeedemo.entity.Employee;
import com.example.employeedemo.service.EmployeeService;

@CrossOrigin(origins = "http://3.110.215.245")
@RestController
@RequestMapping("/api/employees")
public class EmployeeController {
    private final EmployeeService service;

    public EmployeeController(EmployeeService service) {
        this.service = service;
    }

    @GetMapping
    public List<Employee> getAll() {
        return service.getAll();
    }

    @PostMapping
    public Employee create(@RequestBody Employee employee) {
        return service.save(employee);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }
}