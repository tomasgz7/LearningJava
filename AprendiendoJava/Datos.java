package AprendiendoJava;

import java.util.Scanner;

public class Datos {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        String cadena;

        System.out.print("Digitar una cadena: ");
        cadena = entrada.nextLine();

        System.out.println("La cadena es: " + cadena);
        
    }
}

