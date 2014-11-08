package hw2;

import java.util.Scanner;

public class HW2 {
    
    static Scanner userInput;
    
    public static void main(String[] args) {
        userInput = new Scanner(System.in);
        
        System.out.println("Enter two whole numbers: ");
        System.out.print("First number: ");
        int firstNumber = userInput.nextInt();
        System.out.print("Second number: ");
        int secondNumber = userInput.nextInt();
        
        catchZeroDiv(firstNumber, secondNumber);
    }
    
    private static void catchZeroDiv(int a, int b){
        try {
            System.out.println(a + " / " + b + " = " + divideThis(a, b));
            System.out.println(a + " ^ " + b + " = " + Math.pow(a, b));
        } catch (ArithmeticException e) {
            System.out.println("Division by zero detected.  Try again.");
            System.out.print("New second number: ");
            int secondNumber = userInput.nextInt();
            catchZeroDiv(a, secondNumber);
        }
    }
    
    private static int divideThis(int a, int b) throws ArithmeticException{
        if (b == 0) {
            throw new ArithmeticException("Stop dividing by zero");
        }else{
            return a / b;
        }
                
    }
}
