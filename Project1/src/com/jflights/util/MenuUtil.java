package com.jflights.util;
import com.jflights.model.BookingModel;
import java.util.Scanner;

public class MenuUtil {
        public static BookingModel bookFlights() {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter Booking Id : ");
            int bookingId = sc.nextInt();
            sc.nextLine();
            System.out.println("Enter Source: ");
            String source = sc.nextLine();

            System.out.println("Enter Destination: ");
            String destination = sc.nextLine();

            System.out.println("Enter Ticket Class (Economy/Business): ");
            String ticketClass = sc.nextLine();

            System.out.println("Enter Number of Passengers: ");
            int noOfPassengers = sc.nextInt();
            sc.nextLine();

            System.out.println("Is it a round trip (enter true or false)");
            boolean roundTrip = sc.nextBoolean();

            BookingModel bookingModel = new BookingModel();
            bookingModel.setBookingId();
            return bookingModel;

        }
    }


