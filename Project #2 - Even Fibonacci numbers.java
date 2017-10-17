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

// Project #2 - Even Fibonacci numbers
int value1 = 1;
int value2 = 2;
int value3 = 0;
int sum = 2;
System.out.println(value1 +"\n"+ value2);

while(true){
     value3 = value1+value2;
     if (value3>4000000){break;}
     if(value3%2==0){sum+= value3;}
     System.out.println(value3);
     value1 = value2;
     value2 = value3; 
}
System.out.println("sum is " +sum);      
        
    }

}
