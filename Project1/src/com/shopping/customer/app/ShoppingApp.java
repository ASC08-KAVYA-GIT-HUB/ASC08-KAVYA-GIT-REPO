package com.shopping.customer.app;
import com.shopping.customer.Customer;
import com.shopping.customer.products.Product;
import com.shopping.customer.cart.CartItem;
import com.shopping.customer.cart.Order;
import java.util.Scanner;


    public class ShoppingApp {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter customer name: ");
            String custName = sc.nextLine();

            System.out.print("Enter customer email: ");
            String custEmail = sc.nextLine();

            System.out.print("Enter product ID: ");
            int productId = sc.nextInt();
            sc.nextLine(); // consume newline

            System.out.print("Enter product name: ");
            String productName = sc.nextLine();

            System.out.print("Enter product price: ");
            int productPrice = sc.nextInt();

            System.out.print("Enter quantity: ");
            int quantity = sc.nextInt();

            System.out.print("Enter order ID: ");
            int orderId = sc.nextInt();

            // Create objects
            Customer customer = new Customer(custName, custEmail);
            Product product = new Product(productId, productName, productPrice);
            CartItem cartItem = new CartItem(product, quantity);
            Order order = new Order(orderId, customer, cartItem);

            System.out.println("\n===== ORDER DETAILS =====");
            System.out.println(order.displayOrderDetails());

            sc.close();
        }
    }


