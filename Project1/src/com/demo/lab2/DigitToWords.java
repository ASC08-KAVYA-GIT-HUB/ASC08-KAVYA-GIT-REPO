package com.demo.lab2;

import java.util.Scanner;

public class DigitToWords {
    public void printDigitsInWords(int number) {
        String[] words = {"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
        String numStr = String.valueOf(number);
        for (char digit : numStr.toCharArray()) {
            System.out.print(words[digit - '0'] + " ");
        }
    }
    public static void main(String args[]){

        DigitToWords dig = new DigitToWords();
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        dig.printDigitsInWords(a);

    }

}
