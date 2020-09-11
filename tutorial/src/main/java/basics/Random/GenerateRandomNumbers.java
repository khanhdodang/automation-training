package basics.Random;

import java.util.Random;

public class GenerateRandomNumbers {
    static Random rand;

    public static void main(String[] args) {
        rand = new Random();
        System.out.println("Random integer: " + rand.nextInt());
        System.out.println("Random long:    " + rand.nextLong());
        System.out.println("Random boolean: " + rand.nextBoolean());
    }
}
