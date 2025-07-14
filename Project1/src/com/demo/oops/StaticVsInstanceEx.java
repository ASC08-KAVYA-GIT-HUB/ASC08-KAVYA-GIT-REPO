package com.demo.oops;

public class StaticVsInstanceEx {
    public static void main(String args[])
    {
        Employee.companyName="Ascendion";
        System.out.println( Employee.companyName);
        Employee employee1=new Employee();
        employee1.employeeName="Peter";
        System.out.println(employee1.employeeName);
        Employee employee2=new Employee();
        employee2.employeeName="sam";
        System.out.println(employee2.employeeName);
        employee2.companyName="Amazing Company";

        System.out.println(employee2.companyName);

    }
}
class Employee{
    static String companyName="Ascendion";
    public String employeeName;
}
