package com.demo.access_modifiers.p1.p1;

//package com.demo.access_modifiers.p1;



public class P1C1 {
    private String p1;
    private void privateMethod(){
        System.out.println(p1);
    }


    public static void main(String args[]){
        P1C1 p1c1=new P1C1();
        System.out.println(p1c1.p1);
        p1c1.privateMethod();
    }
}
