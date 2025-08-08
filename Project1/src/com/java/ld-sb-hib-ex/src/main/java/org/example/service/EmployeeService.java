package org.example.service;

import org.example.entity.EmployeeModel;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface EmployeeService {
List<EmployeeModel> getAllEmployees();
}
