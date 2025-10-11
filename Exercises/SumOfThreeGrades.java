package Exercises;

import java.util.Scanner;

public class SumOfThreeGrades {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float grade1, grade2, grade3, sum;

        System.out.print("Enter your grades: ");
        grade1 = input.nextFloat();
        grade2= input.nextFloat();
        grade3 = input.nextFloat(); 

        sum = grade1 + grade2 + grade3;
        System.out.println("\nThe sum of your grades is: "+ sum);


  }
}