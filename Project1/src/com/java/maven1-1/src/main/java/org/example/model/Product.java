package org.example.model;

public class Product {

        private String name;
        private String quantity;
        private String id;
        private int price;
        public Product(String name, String quantity, String id, int price) {
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

        public int getPrice() {
            return price;
        }

        public void setPrice(int price) {
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
            Product p=new Product(" ","50","51",800);
        }
    }



