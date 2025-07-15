package com.demo.lab3;

public class MovieClass {
   String movieName;
   String  producedBy;
   String directedBy;
   int  duration;
   int year;
    String  category;
   static int moviesCount;
    //constructor
    public MovieClass(String movieName,String producedBy,String directedBy, int  duration, int year, String  category)
    {
        this.movieName=movieName;
        this.producedBy=producedBy;
        this.directedBy=directedBy;
        this.duration=duration;
        this.year=year;

    }
    public static void main(String args[]){
        MovieClass movie=new MovieClass();
    }




}
