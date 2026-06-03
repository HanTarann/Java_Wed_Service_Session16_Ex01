package ra.edu.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import ra.edu.model.entity.Employee;
import ra.edu.repository.EmployeeRepository;

import java.util.List;

@RestController
@RequestMapping("/api/v1/employees")
@RequiredArgsConstructor
public class EmployeeController {
    private final EmployeeRepository employeeRepository;

    @GetMapping
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }
}