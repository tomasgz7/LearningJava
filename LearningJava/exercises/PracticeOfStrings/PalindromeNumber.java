package LearningJava.exercises.PracticeOfStrings;

public class PalindromeNumber {
    public static void main(String[] args) {
        int n = 1221;
        String s = String.valueOf(n);
        String invertido = new StringBuilder(s).reverse().toString();
        if(s.equals(invertido)) {
            System.out.println("Es Palindromo");
        } else {
            System.out.println("No es Palindromo ");
        }

    }
}
