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

//Project #4 - Largest palindrome product

//// asks for number of digits (not working)
//int numOfDigits = 3;
//String highestNumber = "0";
//String s = "9";
    
 ArrayList<Integer> list = new ArrayList<Integer>();
    
// creates higest possible number with digits
//for (int i = 0; i<numOfDigits;i++){
//highestNumber = highestNumber + s;
//}
////converts to int
//int num1 = Integer.parseInt(highestNumber);
//int num2 = Integer.parseInt(highestNumber);


// strarts from highest then goes down and checks if each answer is a pallindrome
for (int i = 999;i>0;i=i-1){
    for (int j =999;j>0;j=j-1){
    int ans = i * j;
    String answer = String.valueOf(ans);
    if (answer.equals(new StringBuilder(answer).reverse().toString())){
        // if pallindrone adds to ArrayList
        list.add(ans);
    }
}
}
//gets largest number out of arraylist        
System.out.println(Collections.max(list));


    }

}
