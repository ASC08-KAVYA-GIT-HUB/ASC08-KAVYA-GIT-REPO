package com.demo.Exceptions;

public class CheckedExceptions {
    public static void main(String args[])
    {
        int i=10;
        int res=0;
        System.out.println("Exception Handling!");
        try{
            //res=i/1;
            res=i/0;
            System.out.println("divide by zero exception ");//it will not print

        }
        //Doesnot get executed if there is no exception caught
        catch(Exception exception)
        {
            System.out.println(exception.getMessage());
        }

    }

}
