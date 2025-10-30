package LearningJava.exercises.PracticeOfStrings;

public class StringPalindromo {
    public static void main(String[] args) {
        String palabra = "reconocer";
        String invertido =  new StringBuilder(palabra).reverse().toString();
        if (palabra.equals(invertido)) {
            System.out.println("Si, invertido se lee igual");
        } else {
            System.out.println("No, no es igual");}
    }

}
