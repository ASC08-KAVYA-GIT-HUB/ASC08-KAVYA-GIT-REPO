package org.example.service;

import org.example.entity.EmployeeEntity;
import org.example.model.EmployeeModel;
import org.springframework.stereotype.Service;

import java.util.List;

public interface EmployeeService {
List<EmployeeEntity> getAllEmployees();
}
