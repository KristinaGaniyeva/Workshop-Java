package it.sevenbits;

import it.sevenbits.line.Line;
import java.util.Random;

public class Main {
    private static int point_max_value = 50;
    private static int countLine = 6;

    public static void main(String[] args) {

        Random rand = new Random();
        Line randline[] = new Line[countLine];
        double maxline = 0;

        for (int i = 0; i < countLine; i++) {
            randline[i] = new Line(rand.nextInt(point_max_value), rand.nextInt(point_max_value), rand.nextInt(point_max_value), rand.nextInt(point_max_value));
            System.out.println(Math.round(randline[i].getLenght()));
            if (maxline < randline[i].getLenght()) {
                maxline = randline[i].getLenght();
            }
        }
        System.out.println("Max lenght: " + Math.round(maxline));
    }
}


