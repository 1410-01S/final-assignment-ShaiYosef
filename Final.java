import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Random;
import java.util.Scanner;

import javax.print.attribute.standard.QueuedJobCount;

public class Final {
   
    static Random generator;

    static int [][] strengthPossible = {
                                            {1},
                                            {2},
                                            {3},
                                            {4},
                                            {5},
                                            {6},
                                            {7},
                                            {8},
                                            {9},
                                            {10}
                                        };


    static <T> T pickRandom(T[] array){
        int rnd = generator.nextInt(array.length);
        return array[rnd];
    }

    static class World{
        public int est = 0;
        public String name = "Earth";
        public int population = 0;

        Creature[] residents;
        Player[] visitors;
    }

    static class Player{
        private int health = 100;
        public int strength = 0;
        private String name = "";


        public Player(){
            strength = pickRandom(strength);
            name = 
        }

    }

    static class Creature{
        private int health = 100;
        private int age = 0;
        private String knowledge = "";
        private String name = "";


    }

    


    public static void main(String[] args){

        generator = new Random();

        Scanner s = null;

        try{

            s = new Scanner(new BufferedReader(new FileReader("names.txt")));
            s.useLocale(Locale.US);
            s.useDelimiter(pattern:",\\s*");

            

        } finally{
            s.close();
        }



        Player player = new Player();

        System.out.println(player.strength);




    }

}
