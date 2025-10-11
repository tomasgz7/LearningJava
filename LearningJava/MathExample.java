package LearningJava;

import java.util.Scanner;

public class MathExample {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();

        double root = Math.sqrt(number);
        System.out.println("Square root: " + root);

        double number2 = Math.random();

        System.out.println(number2);

        input.close();
    }
}