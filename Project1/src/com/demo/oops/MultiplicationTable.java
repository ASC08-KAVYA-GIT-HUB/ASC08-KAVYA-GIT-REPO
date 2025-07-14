package com.demo.oops;
import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.sql.SQLOutput;
import java.util.*;

public class MultiplicationTable {
    Scanner sc=new Scanner(System.in);
    public void Mul(int n)
    {
        for(int i=1;i<=10;i++)
        {
            System.out.println(n+"*"+i+"="+n*i+  "  ");

        }

    }


    public void Mul2(int n){

        System.out.println();
        int i=1;
        do
        {
            System.out.println(n+"*"+i+"="+n*i+ "  ");
            i++;
        }
        while(i<=10);

    }
    public void Mul3(int n){
        System.out.println();
        int i=1;
        while(i<=10) {

            System.out.println(n+"*"+i+"="+n*i+ " ");

            i++;
        }



    }
    public static void main(String args[])
    {
        MultiplicationTable mul12=new MultiplicationTable();
        mul12.Mul(5);
        mul12.Mul2(3);
        mul12.Mul3(7);
    }


}
