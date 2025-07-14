package com.demo.oops;

import com.demo.Student;

public class TestMain {


public static void main(String args[]){
   // public static void main(String args[]) {
        Student student = new Student();
        student.setName("Kavya");
        student.setId(11);
        student.setCity("Banglore");
        Student student1 = new Student();
        Student student2 = new Student();

        student.setAnnualFee(100);
        student.setTotalMarks(80, 60, 89);
        student1.setAnnualFee(200);
        student1.setTotalMarks(67, 70, 20);
        student2.setAnnualFee(300);
        student2.setTotalMarks(20, 60, 89);
        System.out.println(student.getName());
        System.out.println(student.getId());
        System.out.println(student.getAnnualFee());
        System.out.println(student.getTotalMarks());
        System.out.println(student.getAverage());
        System.out.println(student.getResult());


        System.out.println(student1.getAnnualFee());
        System.out.println(student1.getTotalMarks());
        System.out.println(student1.getAverage());
        System.out.println(student1.getResult());

        System.out.println(student2.getAnnualFee());
        System.out.println(student2.getTotalMarks());
        System.out.println(student2.getAverage());
        System.out.println(student2.getResult());


    }}
