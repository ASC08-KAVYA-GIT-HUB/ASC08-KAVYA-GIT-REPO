package org.example.controller;

import org.example.entity.EmployeeModel;
import org.example.model.Employee;
import org.example.repository.EmployeeRepository;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/employee")
public class EmployeeControllerUsingModel {
    private final EmployeeRepository employeeRepository;

    public EmployeeControllerUsingModel(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @GetMapping("/getHtmlContent")
    public String getHtmlContent()
    {
        String htmlOutput="<html><head><title>Welcome</title></head><body><h1 style=\"color:green\">Rest API can also expose HTML data</h1></body></html>";
                return htmlOutput;
    }

    @GetMapping("/getEmployeeAsList")
    public List<Employee> getEmployeeAsList()
    {
        List<Employee> employees=new java.util.ArrayList<>();
        employees.add(new Employee(1,"Alice"));
        employees.add(new Employee(2,"Bob"));
        employees.add(new Employee(3,"Charlie"));
        return employees;
    }
    @GetMapping("/getEmployeeAsMap")
    public Map<Integer,Employee> getEmployeeAsMap()
    {
        Map<Integer,Employee> employeeMap=new HashMap<>();
        employeeMap.put(1,new Employee(1,"Alice"));
        employeeMap.put(2,new Employee(2,"Bob"));
        employeeMap.put(3,new Employee(3,"Charlie"));
        return employeeMap;
    }

    @PostMapping("/createProduct")

    public EmployeeModel createProduct(@RequestBody EmployeeModel employeeDto) {
        EmployeeModel employeeEntity = new EmployeeModel();
        employeeEntity.setId(employeeDto.getId());
        employeeEntity.setFirstName(employeeDto.getFirstName());
        return employeeRepository.save(employeeEntity);
    }

}
