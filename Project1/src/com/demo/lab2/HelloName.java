package com.demo.lab2;

public class HelloName {
        public static String welcomeMessage(String name) {
            return "Hello " + name + ", Welcome to Java World!";
        }

        public static void main(String[] args) {

            String name = "Kavya";
            String message = welcomeMessage(name);
            // Display the output
            System.out.println(message);
        }
    }


