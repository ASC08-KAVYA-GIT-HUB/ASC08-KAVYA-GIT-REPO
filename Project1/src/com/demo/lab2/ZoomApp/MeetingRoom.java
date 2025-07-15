package com.demo.lab2.ZoomApp;

public class MeetingRoom {
   private int roomId ;
   private byte capacity;
   private String floor;
   //getters and setters
   void setRoomId(int roomId)
   {
      this.roomId=roomId;
   }

   int getRoomId()
   {
      return roomId;
   }
   void setCapacity(byte capacity)
   {
      this.capacity=capacity;
   }
   int getCapacity()
   {
      return capacity;
   }
   void setFloor(String floor)
   {
      this.floor=floor;
   }
   String getFloor()
   {
      return floor;
   }






}
