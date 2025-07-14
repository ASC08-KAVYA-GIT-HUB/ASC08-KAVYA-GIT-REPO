package com.demo.oops.ZoomApp;

import java.time.LocalDate;
import java.time.LocalTime;

public class Booking {
    private Employee employee;
    private MeetingRoom room;
    private LocalDate meetingDate;
    private LocalTime meetingTime;
    private int duration;

    public Booking(Employee employee, MeetingRoom room, LocalDate meetingDate, LocalTime meetingTime, int duration) {
        this.employee = employee;
        this.room = room;
        this.meetingDate = meetingDate;
        this.meetingTime = meetingTime;
        this.duration = duration;
    }

    public LocalDate getMeetingDate() {
        return meetingDate;
    }

    @Override
    public String toString() {
        return "Booking Details:\n" +
                "Employee ID: " + employee.getEmployeeId() + "\n" +
                "Employee Name: " + employee.getName() + "\n" +
                "Room ID: " + room.getRoomId() + "\n" +
                "Floor: " + room.getFloor() + "\n" +
                "Capacity: " + room.getCapacity() + "\n" +
                "Date: " + meetingDate + "\n" +
                "Time: " + meetingTime + "\n" +
                "Duration: " + duration + " minutes";
    }
}
