package com.demo.lab3;

public class Main {

        public static void main(String[] args) {
            MovieClass m1 = new MovieClass("Titanic", "XYZ Productions", "James Cameron", 3, 1997, "Romance");
            specialMovie sm = new specialMovie("Avatar", "Lightstorm", "James Cameron", 3, 2009, "Sci-Fi", "Dolby Atmos", "WETA FX");
            InternationalMovie im = new InternationalMovie("Parasite", "Barunson", "Bong Joon-ho", 2, 2019, "Thriller", "South Korea", "Korean");

            System.out.println(m1.showDetails());
            System.out.println("ID: " + m1.getMovieId());

            System.out.println("\n" + sm.showDetails());
            System.out.println("ID: " + sm.getMovieId());

            System.out.println("\n" + im.showDetails());
            System.out.println("ID: " + im.getMovieId());

            //System.out.println("\nTotal Movies Created: " + MovieClass.getMoviesCount());
        }
    }


