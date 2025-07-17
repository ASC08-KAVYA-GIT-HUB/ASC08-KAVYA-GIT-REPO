package com.demo.collections;
import java.util.ArrayList;
import java.lang.Object;
import java.util.Scanner;


public class ArrayListEx {

    private static void rawtypes() {
        ArrayList names = new ArrayList();
        names.add("Kavya");
        names.add("abc");
        ArithmeticException arithmeticException= new ArithmeticException("sample");
        names.add(arithmeticException);
        names.add(null);
        names.add("null");
        names.add(9);
        //  System.out.println(names.get(2));
        System.out.println(names);
    }

    private static void generictypes() {
        ArrayList<String> names = new ArrayList<>();
        names.add("Kavya");
        names.add("abc");
        System.out.println("Using generic methods");
       // System.out.println(names.get(0));
        //throws an exception
      ArithmeticException arithmeticException= new ArithmeticException("sample");
//        names.add(arithmeticException);
        //typesafety is achieved by generic methods
        names.add(arithmeticException.toString());
        names.add(null);
        System.out.println("Let's see what hasNext returns"+ names.iterator().hasNext());

        names.add("null");
        System.out.println("Using Strings");
        //  System.out.println(names.get(2));
        System.out.println(names);
        // collections do not allow primitives
        //collections allows elements
        ArrayList<Integer> colors=new ArrayList<>();
        colors.add(10);
        colors.add(20);
        colors.add(30);
        colors.add(null);
        //Integer is object type ,not primitive
        //throws error only while used as reference type, int x=null;
        //colors.add(03.4f); floating val
        System.out.println("using integer type");
        System.out.println(colors);

        //how to add all type of numbers in arraylist :Use ArrayList<Number>
        System.out.println("using number class type");
        ArrayList<Number> numbers=new ArrayList<>();
//      numbers.subList(0,1);
//      numbers.iterator();
        numbers.add(10);
        numbers.add(20.5);
        numbers.add(20.8f);
        numbers.add(null);
        //autoboxing
        int primitiveInt=9;
        numbers.add(primitiveInt);
        //explicitly boxing
        Integer boxedInt=Integer.valueOf(primitiveInt);
        numbers.add(Integer.valueOf(boxedInt));
        System.out.println(numbers);

        //how to take user inputs
        ArrayList<String> n= new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        System.out.println("Taking user inputs");
        for(int i=0;i<3;i++)
        {
            System.out.println((i+1)+" Enter your name!");
            String st=sc.next();
            n.add(st);
        }
        System.out.println(n);


    }
    public static void workingWithArrayList()
    {
        ArrayList<String> shopping=new ArrayList<>();
        System.out.println("Using set and remove");
        shopping.add("Searching for shoppping");
        shopping.add("starts walking");
        shopping.add("java");
        shopping.add("collections ex");
        shopping.set(1," starts walking -west");
        System.out.println("1 "+shopping.get(1));
        System.out.println(shopping);
        System.out.println(shopping.remove(3));
        System.out.println("for each loop");
        for(String item:shopping)
        {
            System.out.println(item);
        }
        System.out.println("size of shopping(obj)"+shopping.size());
        ArrayList<String> removeItems=new ArrayList<>();
        removeItems.add(null);
        removeItems.add("collections ex");
        removeItems.add("java");
        //removes all items in removeitems from shopping
        shopping.removeAll(removeItems);
        System.out.println("after removing all  "+shopping);

    }



    public static void main(String[] args) {
        rawtypes();
        generictypes();
        workingWithArrayList();


    }
}
