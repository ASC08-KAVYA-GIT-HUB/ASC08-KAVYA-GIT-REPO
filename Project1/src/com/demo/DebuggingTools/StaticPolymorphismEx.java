package com.demo.DebuggingTools;

public class StaticPolymorphismEx {
    public static void main(String args[]) {
        MovieEx freeSolo = new MovieEx();
        freeSolo.play();
        freeSolo.play(" English");

    }
}
    class  MovieEx
    {
        public void play()
        {
            System.out.println("Playing movie");
        }
        public void play(String subtitle)
        {
            System.out.println("Playing movie with subtitles"+subtitle);
        }

    }


