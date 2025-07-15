package com.demo.lab2;

public class LargestOf3 {

        public static int largest(int a, int b, int c) {
            return Math.max(a, Math.max(b, c));
        }

        public static void main(String[] args) {
            // Example numbers
            int num1 = 10;
            int num2 = 20;
            int num3 = 15;

            int largestNumber = largest(num1, num2, num3);

            System.out.println("The largest number is: " + largestNumber);
        }
    }

