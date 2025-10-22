import java.util.InputMismatchException;
import java.util.Scanner;

public class ArithmeticCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        try {
            System.out.println("Welcome to The Arithmetic Calculator. Choose an operation: ");
            System.out.println("1. Sum");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");

            int operation = input.nextInt();

            System.out.println("Enter the first number: ");
            int num1 = input.nextInt();

            System.out.println("Enter the second number: ");
            int num2 = input.nextInt();

            int result = 0;

            switch (operation) {
                case 1:
                    result = num1 + num2;
                    System.out.println("The result of the sum is: " + result);
                    break;
                case 2:
                    result = num1 - num2;
                    System.out.println("The result of the subtraction is: " + result);
                    break;
                case 3:
                    result = num1 * num2;
                    System.out.println("The result of the multiplication is: " + result);
                    break;
                case 4:
                    if (num2 != 0) {
                        result = num1 / num2;
                        System.out.println("The result of the division is: " + result);
                    } else {
                        System.out.println("Error: division by zero is not allowed");
                    }
                    break;
                default:
                    System.out.println("Invalid Operation");
                    break;
            }

        } catch (InputMismatchException e) {
            System.out.println("Error: Please enter valid numbers only.");
        } finally {
            input.close();
        }
    }
}
