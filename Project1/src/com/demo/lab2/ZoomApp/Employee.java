package com.demo.lab2.ZoomApp;

public class Employee {

        private String employeeId;
        private String name;
//instead of setters
        public Employee(String employeeId, String name) {
            this.employeeId = employeeId;
            this.name = name;
        }

        public String getEmployeeId() {
            return employeeId;
        }

        public String getName() {
            return name;
        }
    }




