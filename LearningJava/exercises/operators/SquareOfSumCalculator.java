package LearningJava.exercises.operators;
/*  
 * Write a program that calculates the square of a sum.
 */
import java.util.Scanner;

public class SquareOfSumCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        float a, b, ab;

        System.out.println("Enter number: ");
        a = input.nextFloat();

        System.out.println("Enter second number: ");
        b = input.nextFloat();

        ab = (a * a) + (b * b) +  (2 * a * b );

        System.out.println("The square of the sum: "+ ab);

        input.close();

    }
    
}
