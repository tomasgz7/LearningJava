package LearningJava;

import java.util.Scanner;

public class NumerosOrdenados {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Escribir primer número: ");
        float num1 = input.nextFloat();

        System.out.print("Escribir segundo número: ");
        float num2 = input.nextFloat();

        // Usamos operador ternario para mostrar de mayor a menor
        float mayor = (num1 > num2) ? num1 : num2;
        float menor = (num1 > num2) ? num2 : num1;

        System.out.println("Números ordenados de mayor a menor: " + mayor + " - " + menor);

        input.close();
    }

}
