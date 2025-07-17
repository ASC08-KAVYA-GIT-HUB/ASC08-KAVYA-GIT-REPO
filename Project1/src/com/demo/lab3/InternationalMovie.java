package com.demo.lab3;

public class InternationalMovie extends MovieClass {
        private String country;
        private String language;

        public InternationalMovie(String movieName, String producedBy, String directedBy, int duration, int year, String category,
                                  String country, String language) {
            super(movieName, producedBy, directedBy, duration, year, category);
            this.country = country;
            this.language = language;
        }

        public String showDetails() {
            return super.showDetails() + "\n"
                    + "Country: " + country + "\n"
                    + "Language: " + language;
        }
    }


