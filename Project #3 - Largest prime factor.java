package projecteuler;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Jakir
 */
public class ProjectEuler {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

//Project #3 - Largest prime factor
        long number;
        number = 600851475143L;

        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                boolean isPrime = true;
                for (int x = 2; x < i; x++) {
                    if (i % x == 0) {
                        isPrime = false;
                    }
                }
                if (isPrime) {
                    System.out.println(i);
                }

            }
        }      
        
    }

}
