package winterpep_github;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

// Question - Generate random numbers in Java
/* Java provides three ways to generate random numbers using some built-in methods and classes as listed below:

java.util.Random class
Math.random method : Can Generate Random Numbers of double type.
ThreadLocalRandom class
 */
public class lecture3 {
    public static void main(String[] args) {

        // create instance of Random class
        Random rand=new Random();

        // Generate random integers in range 0 to 999
        int random1=rand.nextInt(1000);
        double random2=rand.nextDouble(10);
        System.out.println(random1+" "+random2);

        System.out.println(Math.random());


        // Generate random booleans
        boolean rand_bool1 = ThreadLocalRandom.current().nextBoolean();

        // Print random Booleans
        System.out.println("Random Booleans: " + rand_bool1);

    }
}
