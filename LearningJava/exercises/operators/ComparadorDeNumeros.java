package LearningJava.exercises.operators;

import java.util.Scanner;

public class ComparadorDeNumeros {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int num1;
        int num2;
        boolean comparacion;

        System.out.println("Ingresa el primer número: ");
        num1 = input.nextInt();

        System.out.println("Ingresa el segundo número: ");
        num2 = input.nextInt();

        comparacion = num1 == num2;
        System.out.println("Son iguales? " + comparacion);

        if (num1 > num2){
            System.out.println("Es primer numero es mayor");

        } else if (num1 < num2) {

            System.out.println("El segundo es mayor");
        } else {

            System.out.println("Son iguales");
        }

        System.out.println("Ambos son positivos? " + (num1 > 0 && num2 > 0));

        System.out.println("Algun es negativo? " + (num1 < 0 || num2 < 0) );
            input.close();

    }

}
