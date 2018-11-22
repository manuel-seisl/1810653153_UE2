import com.sun.codemodel.internal.JOp;

import javax.swing.*;

public class Aufgabe2_1810653153
{

    public static void main(String[] args)
    {

        int number1 = Integer.parseInt(JOptionPane.showInputDialog("Bitte erste Zahl eingeben:"));
        int number2 = Integer.parseInt(JOptionPane.showInputDialog("Bitte zweite Zahl eingeben:"));

        if ( number1 == number2 )
        {
            JOptionPane.showMessageDialog(null, "Die Zahl lautet: " + number1);
        } else {

            int count = 0;
            int i = 0;

            while(i < 1)
            {
                if(number1 == number2)
                {
                    i++;
                } else {
                    if(number1 > number2){
                        number2++;
                    } else {
                        number1++;
                    }
                    number1 = Integer.parseInt(JOptionPane.showInputDialog("Bitte erste Zahl eingeben:"));
                    number2 = Integer.parseInt(JOptionPane.showInputDialog("Bitte zweite Zahl eingeben:"));
                }
                count++;
            }

            JOptionPane.showMessageDialog(null, "Die Zahl lautet: " + number1 + " und sie haben " + count + " Versuche benötigt.");

        }

    }

}
