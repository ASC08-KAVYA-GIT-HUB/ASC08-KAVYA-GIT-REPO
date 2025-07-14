package com.demo.Gallery;

public class GalleryApp {

    public static void main(String[] args) {
        Photogarph hdPhoto;
        //create the instance
        hdPhoto = new Photogarph();
        //Access the object
        //set the name
        //Accesing the property
        hdPhoto.name = "nandhi Hills";
        System.out.println("Welcome!");
        System.out.println(hdPhoto.name);
        hdPhoto.hang();
        hdPhoto.changeOrientation("landscape");
        boolean isill = hdPhoto.illuminate();
        if (isill) {
            System.out.println("Glowing");
        }
        hdPhoto.autograph();
    }
}

//implement rootedTree
//example written








