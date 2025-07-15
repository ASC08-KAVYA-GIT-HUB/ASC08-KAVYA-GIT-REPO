package com.demo.lab2.ZoomApp;

public class Booking {
    private String employeeId;
    private String employeeName;
    private int roomId;
    private String date;
    private String time;
    private int duration;
    private Booking[] bookings;//array to store

    public Booking(String employeeId, String employeeName, int roomId, String date, String time, int duration) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.roomId = roomId;
        this.date = date;
        this.time = time;
        this.duration = duration;
    }

    public void displayBookingDetails() {
        System.out.println("Booking Details:");
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Employee Name: " + employeeName);
        System.out.println("Room ID: " + roomId);
        System.out.println("Meeting Date: " + date);
        System.out.println("Time: " + time);
        System.out.println("Duration: " + duration + " minutes");
    }
}
