package p3;

import java.util.Scanner;

/**
 *
 * @author Chris W Jones <chris@christopherjones.us>
 */
public class P3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float startingNumber;
        int numReps;
        Scanner userInput = new Scanner(System.in);
        
        System.out.println("Enter the starting number for the first recursion:");
        startingNumber = userInput.nextFloat();
        System.out.println("Enter the number of repetitions for the first recursion:");
        numReps = userInput.nextInt();
        // I went with printf so that I choose the places after the decimal point to show
        System.out.printf("The answer for (%d, %d) is %.2f%n", (int) startingNumber, numReps, firstRecursion(startingNumber, numReps));

        System.out.println("Enter the base number for the second recursion:");
        startingNumber = userInput.nextFloat();
        System.out.println("Enter the number of repetitions for the second recursion:");
        numReps = userInput.nextInt();
        System.out.printf("The answer for (%d, %d) is %.2f%n", (int) startingNumber, numReps, secondRecursion(startingNumber, numReps));
        
        System.out.println("Enter the number of repetitions for the third recursion:");
        numReps = userInput.nextInt();
        System.out.printf("The answer for %d repetitions is %.3f%n", numReps, thirdRecursion(numReps));
    }
    
    public static float firstRecursion(float startingNumber, int numberReps){
        
        /*
            This recursion can be written in a more mathematical way:
            s_0 = startingNumber * 2
            s_k = s_{k-1} * 2
        */
        
        if(numberReps == 1){
            return (float) startingNumber * 2;
        } else {
            return firstRecursion(startingNumber, numberReps - 1) * 2;
        }
        
    }
    
    public static float secondRecursion(float baseNumber, int numberReps){
        
        /*
            This recursion can be written:
            s_0 = baseNumber
            s_k = s_{k-1} + (baseNumber * k)
        */
        if(numberReps == 1){
            return baseNumber;
        }else{
            return secondRecursion(baseNumber, numberReps - 1) + (baseNumber * numberReps);
        }
    }
    
    public static float thirdRecursion(float numberReps){
        
        /*
            This one can be written:
            s_0 = 1
            s_k = s_{k-1} + 1/k
        */
        
        if(numberReps == 1){
            return 1;
        }else{
            return thirdRecursion(numberReps - 1) + (1/numberReps);
        }
    }
    
}
