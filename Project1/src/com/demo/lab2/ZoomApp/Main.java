package com.demo.lab2.ZoomApp;
import java.awt.print.Book;
import java.util.*;
public class Main {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
          //  Booking bookings=new Booking("101", "Kavya",10, "2025-03-06", "01:17" ,3) ;
//            Booking booking[]=new Booking[10];
//         booking[0]=new Booking("101", "Kavya",10, "2025-03-06", "01:17" ,3) ;
//            booking[1]=new Booking("101", "Kavya",10, "2025-03-06", "01:17" ,3) ;
            // Take input
            System.out.print("Enter Employee ID: ");
            String empId = sc.nextLine();

            System.out.print("Enter Employee Name: ");
            String empName = sc.nextLine();

            System.out.print("Enter Room ID: ");
            int roomId = sc.nextInt();
            sc.nextLine(); // consume newline

            System.out.print("Enter Meeting Date (YYYY-MM-DD): ");
            String date = sc.nextLine();

            System.out.print("Enter Meeting Time (HH:mm): ");
            String time = sc.nextLine();

            System.out.print("Enter Duration (in minutes): ");
            int duration = sc.nextInt();

            // Create and display booking
            Booking booking = new Booking(empId, empName, roomId, date, time, duration);
            booking.displayBookingDetails();//only taking one

            sc.close();
        }
    }


