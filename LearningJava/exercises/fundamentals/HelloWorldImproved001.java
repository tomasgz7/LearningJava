package LearningJava.exercises.fundamentals;

import java.util.Scanner;

public class HelloWorldImproved001 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        //Solicitar el nombre al usuario
        System.out.println("Escribí tu nombre: ");
        String name = input.nextLine();
        
        //Mensaje de bienvenida personizado
        
        System.out.println("Hola! " + name + ", Bienvenido al mundo de Java!");
       
        //Detiene la ejecución del scanner para liberar recursos.
        input.close();
    }
    
}
