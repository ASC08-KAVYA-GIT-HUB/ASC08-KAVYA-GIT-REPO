package com.demo.lab1;

public class StringMethodsExample {
    public static void main(String args[])
    {
        String str1="Java is a platform ";
        String str2="Java is platform indepandent";
        String s1="java";
        System.out.println("CharAt0 = "+str1.charAt(0));
        System.out.println("CharAt5= "+str1.charAt(5));
        System.out.println("Contains=  "+str1.contains("Java"));
        System.out.println("length()= "+str1.length());
        System.out.println("indexOf()=  "+str1.indexOf("is"));
        System.out.println("equals() "+str1.equals(str2));
        System.out.println("equals() "+s1.equals(s1));
        System.out.println(" equalsIgnoreCase(trimmed) "+str1.equalsIgnoreCase(str1));
        System.out.println("join  "+s1.join("hi"));
        System.out.println("lastIndexOf "+str1.lastIndexOf("p"));
        System.out.println("substring   "+str1.substring(4,7));
        System.out.println("to lower case  "+str2.toLowerCase());
        System.out.println("to upper case "+str1.toUpperCase());
        System.out.println("trim "+str1.trim());


    }



}
