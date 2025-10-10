package LearningJava;

import javax.swing.JOptionPane;

public class JOptionPaneExample {
    public static void main(String[] args) {
        String text;
        int number;
        char letter;
        double decimal;

        text = JOptionPane.showInputDialog("Enter a string:");
        number = Integer.parseInt(JOptionPane.showInputDialog("Enter an integer:"));
        letter = JOptionPane.showInputDialog("Enter a character:").charAt(0);
        decimal = Double.parseDouble(JOptionPane.showInputDialog("Enter a decimal number:"));

        JOptionPane.showMessageDialog(null, "The string is: " + text);
        JOptionPane.showMessageDialog(null, "The integer number is: " + number);
        JOptionPane.showMessageDialog(null, "The entered character is: " + letter);
        JOptionPane.showMessageDialog(null, "The entered decimal number is: " + decimal);
    }
}
