package LearningJava;

import java.util.Scanner;

public class Operators {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float number1, number2, sum, subtraction, multiplication, division, remainder;

        System.out.print("Enter 2 numbers: ");
        number1 = input.nextFloat();
        number2 = input.nextFloat();

        sum = number1 + number2;
        subtraction = number1 - number2;
        multiplication = number1 * number2;
        division = number1 / number2;
        remainder = number1 % number2;

        System.out.println("The sum is: " + sum);
        System.out.println("The subtraction is: " + subtraction);
        System.out.println("The multiplication is: " + multiplication);
        System.out.println("The division is: " + division);
        System.out.println("The remainder is: " + remainder);

        input.close(); // good practice: close the Scanner
    }
}
