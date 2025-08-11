package org.example.controller;

import org.example.entity.EmployeeEntity;
import org.example.model.EmployeeModel;
import org.example.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v2")
public class EmployeeControllerUsingEntityFromDb {
        private final EmployeeService employeeService;
        @Autowired
        public EmployeeControllerUsingEntityFromDb(EmployeeService employeeService){
            this.employeeService = employeeService;
        }
       @GetMapping("/employees")
       List<EmployeeEntity> getAllEmployees() {
            return  employeeService.getAllEmployees();
        }
    }

