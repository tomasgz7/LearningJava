package LearningJava.exercises.practice;

public class TotalSuma {
    public static void main(String[] args) {
            int[] numeros = {7, 2, 15, 17};
            int suma = 0;

            for (int i = 0; i < numeros.length; i++) {
                suma += numeros[i];
            }

            System.out.println("Suma total: " + suma);
        }
    }


