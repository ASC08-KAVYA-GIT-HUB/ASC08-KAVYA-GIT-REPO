package com.demo.collections;

import java.util.HashMap;

public class MapExample {
    //maps are used to store key value pairs
    public static void main(String args[]) {
        m1();
    }

    private static void m1()
    {
        //map can have unique keys and can hava duplictae values<key,val>
        HashMap<Object,Object> map1=new HashMap<Object,Object>();
        laptop laptop1=new laptop("inspire",10);
        laptop laptop2=new laptop("Thinkpad",10);
        map1.put("HP",laptop1);
       String laptopBrand="Lenovo";
        map1.put(laptopBrand,laptop2);
        map1.put("HP", new laptop("Pavillion", 10));//this is duplicate of key
        map1.put("null", new laptop("Tuf", 10));
        map1.put(null, new laptop("Rog", 10));//null key
        map1.put(null, new laptop("MacBook", 10));//same
        map1.put("null", new laptop("Vaio", 10));
        map1.put("Sony", new laptop("Vaio", 10));
        System.out.println(map1);
       laptop1.toString();


    }
}
    class laptop{
        String laptopName;
        float price;
        public laptop(String laptopNameex,float priceex)
        {
            laptopName=laptopNameex;
            price=priceex;
        }


        public String toString()
        {
            return "laptop [laptopName:"+ laptopName+",price"+price+"]";
        }

    }


