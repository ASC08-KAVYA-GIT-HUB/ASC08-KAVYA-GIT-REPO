package com.shopping.customer.cart;
import com.shopping.customer.Customer;

public class Order {

    private int orderId;
    private Customer customer;
    private CartItem item;

    public Order(int orderId, Customer customer, CartItem item) {
        this.orderId = orderId;
        this.customer = customer;
        this.item = item;
    }

    public String displayOrderDetails() {
        return "Order ID: " + orderId +
                "\nCustomer: " + customer.getName() +
                "\nEmail: " + customer.getEmail() +
                "\nProduct: " + item.getProduct().getName() +
                "\nQuantity: " + item.getQuantity() +
                "\nTotal Price: ₹" + item.getTotalPrice();
    }
}