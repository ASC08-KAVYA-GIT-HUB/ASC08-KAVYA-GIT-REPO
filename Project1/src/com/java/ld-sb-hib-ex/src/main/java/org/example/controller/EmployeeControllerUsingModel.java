package org.example.controller;

import org.example.entity.EmployeeEntity;
import org.example.model.EmployeeModel;
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
    public List<EmployeeModel> getEmployeeAsList()
    {
        List<EmployeeModel> employees=new java.util.ArrayList<>();
        employees.add(new EmployeeModel(1,"Alice"));
        employees.add(new EmployeeModel(2,"Bob"));
        employees.add(new EmployeeModel(3,"Charlie"));
        return employees;
    }
    @GetMapping("/getEmployeeAsMap")
    public Map<Integer, EmployeeModel> getEmployeeAsMap()
    {
        Map<Integer, EmployeeModel> employeeMap=new HashMap<>();
        employeeMap.put(1,new EmployeeModel(1,"Alice"));
        employeeMap.put(2,new EmployeeModel(2,"Bob"));
        employeeMap.put(3,new EmployeeModel(3,"Charlie"));
        return employeeMap;
    }

    @PostMapping("/createProduct")

    public EmployeeEntity createProduct(@RequestBody EmployeeEntity employeeDto) {
        EmployeeEntity employeeEntity = new EmployeeEntity();
        employeeEntity.setId(employeeDto.getId());
        employeeEntity.setFirstName(employeeDto.getFirstName());
        return employeeRepository.save(employeeEntity);
    }

}
