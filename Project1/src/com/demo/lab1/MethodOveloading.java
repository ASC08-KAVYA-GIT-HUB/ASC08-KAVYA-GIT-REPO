package com.demo.lab1;

public class MethodOveloading {

        public int add(short a, short b) {
            return a + b;
        }

        public int add(int a, int b, int c) {
            return a+b+c;
        }

        public double add(double a, double b) {
           return a+b;
        }

        public String add(String a, int b) {
           return a+ "  " + b;
        }

        public static void main(String args[])
        {
            MethodOveloading method=new MethodOveloading();
            System.out.println(method.add(10,20));
            System.out.println( method.add(10,20,30));
            System.out.println(method.add(10.5,20.1));
            System.out.println(method.add("Hello",20));
        }
    }



