package LearningJava;

import java.util.Scanner;

public class Data {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String text;

        System.out.print("Enter a string: ");
        text = input.nextLine();

        System.out.println("The string is: " + text);

        input.close();
    }
}
