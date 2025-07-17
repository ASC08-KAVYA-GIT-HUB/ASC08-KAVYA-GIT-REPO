package com.demo.lab3;

public class MovieClass {
    private String movieName;
    private String producedBy;
    private String directedBy;
    private int duration;
    private int year;
    private String category;
    private static int moviesCount = 0;
    private final String movieId;

    //constructor
    public MovieClass(String movieName, String producedBy, String directedBy, int duration, int year, String category) {
        this.movieName = movieName;
        this.producedBy = producedBy;
        this.directedBy = directedBy;
        this.duration = duration;
        this.year = year;
        this.category = category;
        moviesCount++;//increase the movie count whenever new object is created
        this.movieId = movieName + "_" + moviesCount;
    }

    public String getMovieId() {
        System.out.println();
        return movieId;

    }

    public String showDetails() {
        System.out.println("Movie Details:");
        return "Movie ID: " + movieId + "\n"
                + "Name: " + movieName + "\n"
                + "Produced By: " + producedBy + "\n"
                + "Directed By: " + directedBy + "\n"
                + "Duration: " + duration + "\n"
                + "Year: " + year + "\n"
                + "Category: " + category;
    }
//    public static void main(String args[]){
//        MovieClass movieClass=new MovieClass(" abc", " producer1", "director1", 3, 2025, "category1");
//        MovieClass movieClass1=new MovieClass(" titanic", " producer2", "director2", 2, 2025, "category2");
//
//        System.out.println(movieClass.showDetails());
//        System.out.println(movieClass.getMovieId());
//        System.out.println(movieClass1.showDetails());
//        System.out.println(movieClass1.getMovieId());
//    }

}