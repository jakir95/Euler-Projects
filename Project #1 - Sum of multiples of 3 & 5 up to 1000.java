package projecteuler;

/**
 *
 * @author Jakir
 */
public class ProjectEuler {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // Project #1 - Sum of multiples of 3 & 5 upto 1000
        int sum = 0;
        for (int i =0; i<1000;i++){
            if (i%3==0 || i%5==0){
                sum += i;
            }
        }
        System.out.println(sum);       
        
    }

}
