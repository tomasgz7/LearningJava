package AprendiendoJava;

import javax.swing.JOptionPane;

public class JoptionPane {
    public static void main(String[] args) {
        String cadena;
        int entero;
        char letra;
        double decimal;

        cadena = JOptionPane.showInputDialog("Escribe una cadena: ");

        entero =  Integer.parseInt(JOptionPane.showInputDialog("Escribe un entero"));

        letra = JOptionPane.showInputDialog("Escribe un caracter: ").charAt(0);

        decimal = Double.parseDouble(JOptionPane.showInputDialog("Escribe un decimal"));

        JOptionPane.showMessageDialog(null, "La cadena es: "+cadena);

        JOptionPane.showMessageDialog(null, "El numero entero es: "+entero);

        JOptionPane.showMessageDialog(null, "El caracter ingresado es "+letra);

        JOptionPane.showMessageDialog(null, "El decimal que se ingresó es: "+decimal);

    }
}
