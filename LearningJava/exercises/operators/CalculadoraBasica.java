package LearningJava.exercises.operators;

import java.util.Scanner;

public class CalculadoraBasica {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int primerNumero, segundoNumero, suma, resta, multiplicacion, division, resto;

        System.out.println("Ingresa el primer número: ");
        primerNumero = input.nextInt();

        System.out.println("Ingresa el segundo numero: ");
        segundoNumero = input.nextInt();

        suma = primerNumero + segundoNumero;
        System.out.println("Suma: " + suma);

        resta = primerNumero - segundoNumero;
        System.out.println("Resta: " + resta);

        multiplicacion = primerNumero * segundoNumero;
        System.out.println("Multiplicación: " + multiplicacion);

        division = primerNumero / segundoNumero;
        System.out.println("División: " + division);

        resto = primerNumero % segundoNumero;
        System.out.println("Resto: " + resto);

        input.close();
    }
}
