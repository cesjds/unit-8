/***************************************************************
 * Written by: Hadley Steelman
 *
 ***************************************************************/
import java.awt.Color;
import java.awt.Font;

import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.plaf.FontUIResource;

public class NumberConversion
{
    public static void changeJOP()
    {

    }

    public static int enterNum()
    {
        int num=0;
        do {
            num = Integer.parseInt(JOptionPane.showInputDialog("Enter a positive integer: "));
        }while (num<0);
        return num;
    }
    public static int printAnswer(Number n1)
    {
        String[] choices = {"Enter another number", "Quit"};
        String message = "Here is your number: \n"+n1+"\n\nWhat do you want to do? ";
        int choice=JOptionPane.showOptionDialog	(null, message, "Number Conversion", 0, 3, null, choices, null);
        return choice;
    }
    public static void main(String[] args)
    {
        changeJOP();

        Number n1 = new Number();
        int num=0, choice=0;
        String message = "";

        while(choice == 0) {
            num = enterNum();
            n1.setDecimal(num);
            choice = printAnswer(n1);
        }
    }
}