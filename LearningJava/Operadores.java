package LearningJava;

import java.util.Scanner;

public class Operadores {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float num1, num2, suma, resta, mult, div, resto;

        System.out.print("Escribe 2 numeros: ");
        num1 = entrada.nextFloat();
        num2 = entrada.nextFloat();

        suma = num1 + num2;
        resta = num1 - num2;
        mult = num1 * num2;
        div = num1 / num2;
        resto = num1 % num2;

        System.out.println("La suma es: " + suma);
         System.out.println("La resta es: " + resta);
          System.out.println("La multiplicación es: " + mult);
           System.out.println("La divisón es: " + div);
            System.out.println("El resto es es: " + resto);

        
    }
}
