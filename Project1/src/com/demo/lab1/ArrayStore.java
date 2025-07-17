package com.demo.lab1;
import java.util.*;
public class ArrayStore {
    int n;
    private int[] array1 = new int[n];

    Scanner sc=new Scanner(System.in);
    public void acceptInput(){
        System.out.println("enter array size");
        n=sc.nextInt();
        array1=new int[n];
        System.out.println("array elements:");
        for(int i=0;i<n;i++)
        {
            array1[i]=sc.nextInt();
        }

    }
    public void displayForLoop()
    {
        for(int i=0;i<n;i++)
        {
            System.out.println(array1[i]+"  ");
        }
        System.out.println();
    }
    public void displayWhileloop()
    {
        int i=0;
        while(i<n)
        {
            System.out.println(array1[i]);
            i++;
        }

    }

    public void sorting()
    {
        System.out.println("sorting");
        Arrays.sort(array1,0,n);
    }
    public int countOccurrences(int num) {
        int count = 0;
        for (int i = 0; i <n; i++) {
            if (array1[i] == num)
                count++;
        }
        return count;
    }
    public void insertAt() {

Scanner sc=new Scanner(System.in);
        System.out.println("enter the number and position to which element should be added");

        int obj=sc.nextInt();
        int obj2=sc.nextInt();
        array1[obj2] = obj;


        System.out.println("After insertion:");
        displayForLoop();
       ;
    }

    public void removeDuplicates() {
            Set<Integer> set = new LinkedHashSet<>();
            for (int i = 0; i < array1.length; i++) {
                set.add(array1[i]);
            }

            System.out.println("\nUnique elements after removing duplicates:");
            for (int value : set) {
                System.out.print(value + " ");
            }
        }


    public static void main(String args[])
    {
        ArrayStore a1=new ArrayStore();
        a1.acceptInput();;
        a1.displayForLoop();
        a1.displayWhileloop();
        a1.sorting();
        a1.displayForLoop();
        System.out.println(a1.countOccurrences(3));
        a1.insertAt();
        a1.removeDuplicates();

    }





}
