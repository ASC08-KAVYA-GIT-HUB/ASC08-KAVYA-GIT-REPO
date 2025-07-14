package com.demo.oops;

public class WordCount {

    public static void main(String[] args) {
        String inputString = "Sum of 12 and 20 is 32";
        // if (inputString== null) {
        //     return 0;}

        //creating array,to split the string
        String[] words = inputString.split("\\s+");// or for space (" ")
        int count = 0;
        for (String word : words) {
            if (!word.matches("\\d+")) {
                count++;
            }
        }
        System.out.println(count);

    }

}
