package com.example.model;

public class product {
    private String name;
    private String quantity;
    private String id;
    private String price;
    public product(String name, String quantity,String id,String price) {
        this.name = name;
        this.quantity = quantity;
        this.id=id;
        this.price=price;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getName() {

       try {
           if (name == null){
               System.out.println("name cannot be null");
           }
       }
       catch(RuntimeException e)
       {
           System.out.println(e.getMessage());
       }

        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString()
    {
        return "product details"+
                "id :"+id+"\t"+
                "name :"+name+"\t"+"price :"+price+"\t"+"quantity :"+quantity;
    }
    public static void main(String args[])
    {
        product p=new product(" ","50","51","800");
    }
}


