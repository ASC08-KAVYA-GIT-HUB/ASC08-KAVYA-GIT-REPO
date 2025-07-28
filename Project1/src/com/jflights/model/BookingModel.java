package com.jflights.model;

public class BookingModel {
        private int bookingId;
        private String source;
        private String destination;
        private  String ticketClass;
        private int noOfPassengers;
        private boolean roundTrip;
    public BookingModel() {
    }

    public BookingModel(int bookingId,String source,String destination,int noOfPassengers,boolean roundTrip){
           this.bookingId = bookingId;
           this.source = source;
           this.destination = destination;
           this.ticketClass = ticketClass;
           this.noOfPassengers = noOfPassengers;
           this.roundTrip = roundTrip;
       }
        private void getDestination()
        {
            this.destination=destination;

        }
        private String setDestination()
        {
            return destination;
        }
        private void getnoOfPassengers()
        {
            this.noOfPassengers=noOfPassengers;

        }
        private int  setnoOfPassengers()
        {
            return noOfPassengers;
        }
        private void getticketClass()
        {
            this.ticketClass=ticketClass;

        }
        private String setticketClass()
        {
            return ticketClass;
        }
    public boolean isRoundTrip() { return roundTrip; }
    public void setRoundTrip(boolean roundTrip) {
           this.roundTrip = roundTrip;
       }
       public void setBookingId()
       {
           this.bookingId=bookingId;
       }
       private int getBookingId()
       {
           return bookingId;
       }

@Override
public String toString()
{
    return "Booking id "+bookingId+"source "+source+"destination "+destination+" ticket class "+ticketClass
            +"noOfPassengers "+noOfPassengers+" roundTrip "+roundTrip;
}

//  add destination, ticketClass, noOfPassengers, roundTrip
//  generate getters/ setters
//  override toString method
//  create default and parameterized constructors
    }
