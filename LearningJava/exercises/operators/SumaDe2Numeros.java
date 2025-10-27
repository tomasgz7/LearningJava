package LearningJava.exercises.operators;

import java.util.Scanner;

public class SumaDe2Numeros {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numberOne, numberTwo, total;


        System.out.println("Ingresa  el primero número: ");
        numberOne = input.nextInt();

        System.out.println("Ingresa  el segundo número: ");
        numberTwo = input.nextInt();

        total = numberOne + numberTwo;
        System.out.println("La suma es: " + total);

        input.close();
    }


}

