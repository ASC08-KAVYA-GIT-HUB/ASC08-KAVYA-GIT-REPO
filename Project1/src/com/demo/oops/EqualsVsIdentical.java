package com.demo.oops;

public class EqualsVsIdentical {

 public static void main(String[] args) {


            String s1 = "yes";
            String s2 = "yes";
            String s3 = new String (s1);
            // checks for equality
            if(s1.equals(s2)) {
                System.out.println("(s1.equals(s2)");//true
            }
            // identicality
            if(s1 == s2) {
                System.out.println("(s1 == s2)");//true
            }

            if(s1.equals(s3)) {
                System.out.println("(s1.equals(s3)");//true
            }

            if(s1 == s3) {
                System.out.println("(s1 == s2)");//false becuase java creates new string using new keyword
            }
        }
    }//s1 and s2 points to same varible and loc coz java creates string literals concepts

