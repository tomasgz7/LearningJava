package LearningJava.exercises.fundamentals;

import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double usd = 1.0;
        double eur = 0.98;
        double ars = 1490.24;
        double brl = 5.6;

        System.out.println("Conversor de Monedas");
        System.out.println("Ingresar moneda de origen (USD, EUR, ARS, BRL): ");
        String from = input.nextLine().toUpperCase();

        System.out.println("Ingresa la moneda destino (USD, EUR, ARS, BRL): ");
        String to = input.nextLine().toUpperCase();

        System.out.println("Ingresa el monto: ");
        double amount = input.nextDouble();

        double rateFrom = 0;
        double rateTo = 0;

        if (from.equals("USD")) rateFrom = usd;
        else if (from.equals("EUR")) rateFrom = eur;
        else if (from.equals("ARS")) rateFrom = ars;
        else if (from.equals("BRL")) rateFrom = brl;
        else {
            System.out.println("Moneda de origen no válida,");
            return;
        }

        if (to.equals("USD")) rateTo = usd;
        else if(to.equals("EUR")) rateTo = eur;
        else if(to.equals("ARS")) rateTo = ars;
        else if(to.equals("BRL")) rateTo = brl;
        else {
            System.out.println("Monena de destino no válida");
            return;
        }

        double result = amount * rateTo / rateFrom;
        System.out.println(amount + " " + from + " equivalen a " + result + " " + to);

        input.close();



    }
}
