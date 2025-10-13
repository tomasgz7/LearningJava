package LearningJava.exercises.operators;
/*  
Exercise 2: Guillermo has N dollars. Luis owns half of what Guillermo has. Juan owns half of the total amount that Luis and Guillermo have together.
Write a program that calculates and prints the total amount of money they have combined.
 */

import java.util.Scanner;

public class MoneyDistribution {
    public static void main(String[] args) {
       Scanner input = new Scanner (System.in);
       float guillermo, juan, luis, total;

       System.out.println("Enter the amount of money Guillermo has: ");
       guillermo = input.nextFloat();

       luis = guillermo / 2;

       juan = (guillermo + luis) / 2;

       total = guillermo + luis + juan;
       
       System.out.println("\n The total amount of money among the three is: " + total);
    }
}
