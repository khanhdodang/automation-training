package basics.Random;

import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.SecureRandom;

public class GenerateRandomNumbers3 {

    static SecureRandom secureRandomGenerator;

    public static void main(String[] args) {
        /*
        Generating Secure Random Numbers in Java
        The Random class generates random numbers in a deterministic way.
        The algorithm that produces the randomness is based on a number called a seed.
        If the seed number is known then it’s possible to figure out the numbers that are going to be produced from the algorithm.

        The goal of the SecureRandom Class is to generate cryptographically strong random numbers.

        The SecureRandom must produce non-deterministic output.
        Therefore any seed material passed to a SecureRandom object must be unpredictable.

        Below is an example usage of the SecureRandom class to generate random numbers in Java
         */

        try {
            secureRandomGenerator = SecureRandom.getInstance("SHA1PRNG", "SUN");
        }
        catch (NoSuchAlgorithmException | NoSuchProviderException e) {
        }

        //Get random integer in range
        int randInRange = secureRandomGenerator.nextInt(499);
        System.out.println(randInRange);
    }
}
