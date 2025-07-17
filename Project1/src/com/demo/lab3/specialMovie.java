package com.demo.lab3;

public class specialMovie extends MovieClass{
        private String soundEffectsTechnology;
        private String visualEffectsTechnology;

        public specialMovie(String movieName, String producedBy, String directedBy, int duration, int year, String category,
                            String soundEffectsTechnology, String visualEffectsTechnology) {
            super(movieName, producedBy, directedBy, duration, year, category);
            this.soundEffectsTechnology = soundEffectsTechnology;
            this.visualEffectsTechnology = visualEffectsTechnology;
        }

        public String showDetails() {
            return super.showDetails() + "\n"
                    + "Sound Effects: " + soundEffectsTechnology + "\n"
                    + "Visual Effects: " + visualEffectsTechnology;
        }
    }

