package LearningJava.exercises.fundamentals;

import java.util.Scanner;

public class GradeManager {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.println("Cuantos alumnos desea cargar?");
        int cantidad = input.nextInt();
        input.nextLine();

        double[] promedios = new double[cantidad];
        String[] alumnos = new String[cantidad];

        for (int i = 0; i < cantidad; i++) {
            System.out.println("Ingresa el nombre del alumno: " + (i + 1) + ": ");
            alumnos[i] = input.nextLine();

            int notaUno, notaDos;
            System.out.println("Ingresa la primera nota: ");
            notaUno = input.nextInt();

            System.out.println("Ingresa la 2da nota: ");
            notaDos = input.nextInt();
            input.nextLine();

            int promedio = (notaUno + notaDos) / 2;
            promedios[i] = promedio;

            if (promedio >= 6) {
                System.out.println("Estás aprobado!" + alumnos[i]);

            } else {
                System.out.println("Estás desaprobado!");
            }

        }
        System.out.println("Resumen final: ");
        for (int i = 0; i < cantidad; i++) {
            String estado = (promedios[i] >= 6) ? "APROBADO" : "DESAPROBADO";
            System.out.printf("%s: Promedio = %.2f (%s)%n", alumnos[i], promedios[i], estado);
        }
        input.close();


    }
}