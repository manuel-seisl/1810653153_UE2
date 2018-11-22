import javax.swing.*;

public class Aufgabe5_1810653153
{

    public static void main(String[] args)
    {

        // For-Schleife

        forschleife(10);
        forschleife(20);

        // While-Schleife

        whileschleife(10);
        whileschleife(20);

        // Nutzer-Schleife

        nutzerschleife();

    }

    public static void forschleife(int a)
    {

        for(int i = 1; i <= a; i++)
        {
            System.out.println("Der Schleifenzähler ist: " + i);
        }

    }

    public static void whileschleife(int a)
    {

        int i = 0;

        while(i <= a)
        {
            System.out.println("Der Schleifenzähler ist: " + i);
            i = i + 2;
        }

    }

    public static void nutzerschleife()
    {

        int zahl1 = Integer.parseInt(JOptionPane.showInputDialog("Bitte erste Zahl eingeben:"));
        int zahl2 = Integer.parseInt(JOptionPane.showInputDialog("Bitte zweite Zahl eingeben:"));
        int count = 1;


        for(int i = 0; i < zahl1; i++)
        {
            for(int j = 0; j < zahl2; j++)
            {
                System.out.println("Das ist der " + count + ". Durchlauf der inneren Schleife!");
                count++;
            }
        }


    }

}
