package com.shopping.customer.products;

public class Product {

        private int productId;
        private String name;
        private int price;

        public Product(int productId, String name, int price) {
            this.productId = productId;
            this.name = name;
            this.price = price;
        }

        public int getProductId() {
            return productId;
        }

        public String getName() {
            return name;
        }

        public int getPrice() {
            return price;
        }
    }


