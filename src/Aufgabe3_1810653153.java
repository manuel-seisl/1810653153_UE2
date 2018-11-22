import jdk.nashorn.internal.scripts.JO;

import javax.swing.*;

public class Aufgabe3_1810653153
{

    public static void main(String[] args)
    {

        // Double

        double alter;
        String eingabe = JOptionPane.showInputDialog("Bitte Eingabe tätigen:");

        alter = Double.parseDouble(eingabe);
        JOptionPane.showMessageDialog(null, "Double: " + alter);

        // Integer

        int alter1;

        alter1 = Integer.parseInt(eingabe);
        JOptionPane.showMessageDialog(null, "Integer: " + alter1);

        // Boolean

        boolean alter2;

        alter2 = Boolean.parseBoolean(eingabe);
        JOptionPane.showMessageDialog(null, "Boolean: " + alter2);

        // Long

        long alter3;

        alter3 = Long.parseLong(eingabe);
        JOptionPane.showMessageDialog(null, "Long: " + alter3);

        // Char

        char alter4;

        alter4 = eingabe.charAt(0);
        JOptionPane.showMessageDialog(null, "Char: " + alter4);

        // Byte

        byte alter5;

        alter5 = Byte.parseByte(eingabe);
        JOptionPane.showMessageDialog(null, "Byte: " + alter5);

        // Short

        short alter6;

        alter6 = Short.parseShort(eingabe);
        JOptionPane.showMessageDialog(null, "Short: " + alter6);

        // Float

        float alter7;

        alter7 = Short.parseShort(eingabe);
        JOptionPane.showMessageDialog(null, "Float: " + alter7);

        String newString = String.valueOf(alter);
        JOptionPane.showMessageDialog(null, newString);

    }

}
