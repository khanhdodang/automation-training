package basics.Random;

import java.util.Random;

public class GenerateRandomNumbers2 {

    static Random rand;

    public static void main(String[] args) {
        rand = new Random();
        int randInt = rand.nextInt(5) + 1;
        System.out.println("Random integer: " + randInt);
    }
}
