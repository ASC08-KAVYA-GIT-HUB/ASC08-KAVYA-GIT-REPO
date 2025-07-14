package com.demo;

public class Student {
    private int studentId;
    private String studentName;
    private String city;
    private int marks1;
    private int marks2;
    private int marks3;
    private float feePerMonth;
    private boolean isEligibleForScholarship;

    public void setName(String studentName)
    {
        this.studentName=studentName;
    }
    public String getName()
    {
        return studentName;

    }
    public void setId(int studentId)
    {
        this.studentId=studentId;
    }
    public int getId()
    {
        return studentId;
    }

    public void setCity(String city)
    {
        this.city=city;
    }
    public String getCity()
    {
        return city;
    }



    public void setAnnualFee(int fee) {
        feePerMonth = fee;
    }

    public void setTotalMarks(int m1, int m2, int m3) {
        marks1 = m1;
        marks2 = m2;
        marks3 = m3;

    }


   public float getAnnualFee() {
        return feePerMonth * 12;

    }

   public int getTotalMarks() {
        return marks1 + marks3 + marks3;
    }

   public int getAverage() {
        return (marks1 + marks2 + marks3) / 3;
    }

   public String getResult() {
        if (marks1 >= 60 && marks2 >= 60 && marks3 >= 60) {
            return "pass";

        } else {
            return "fail";
        }

    }
}




