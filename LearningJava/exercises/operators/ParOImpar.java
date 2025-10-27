package LearningJava.exercises.operators;

import java.util.Scanner;

public class ParOImpar {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int numero;

        System.out.println("Ingresa un número: ");
        numero = input.nextInt();


        System.out.println((numero % 2 == 0) ? "Es par" : "Es impar");

        String resultado = (numero > 0) ? "positivo" : ((numero < 0) ? "negativo" : "cero");
        System.out.println("El numero es: " + resultado);

        input.close();
    }
}
