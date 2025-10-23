package com.example.employeedemo.service;

import org.springframework.stereotype.Service;
import java.util.List;
import com.example.employeedemo.entity.Employee;
import com.example.employeedemo.repository.EmployeeRepository;

@Service
public class EmployeeService {
    private final EmployeeRepository repository;

    public EmployeeService(EmployeeRepository repository) {
        this.repository = repository;
    }

    public List<Employee> getAll() {
        return repository.findAll();
    }

    public Employee save(Employee employee) {
        return repository.save(employee);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}