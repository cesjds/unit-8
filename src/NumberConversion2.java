/***************************************************************
 * Written by: Hadley Steelman
 *
 ***************************************************************/
import java.awt.Color;
import java.awt.Font;

import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.plaf.FontUIResource;

public class NumberConversion2
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
    public static int baseMenu()
    {
        String[] choices = {"Hexadecimal", "Octal", "Binary"};
        int choice = JOptionPane.showOptionDialog	(null, "What base do you want to see? ",
                "Number Conversion", 0, 3, null, choices, null);
        return choice;
    }
    public static String findAnswer(Number n1, int choice) {
        String answer = "";
        switch(choice) {
            case 0: answer = n1.getHexadecimal(); break;
            case 1: answer = n1.getOctal(); break;
            case 2: answer = n1.getBinary(); break;
        }
        return answer;
    }
    public static int printAnswer(Number n1, String answer, int choice)
    {
        int base = 0;
        switch(choice){
            case 0: base = 16; break;
            case 1: base = 8; break;
            case 2: base = 2; break;
        }
        String[] choices = {"Enter another number", "Quit"};
        String message = ""+n1.getDecimal()+" in base "+base+" equals "+answer;
        int choice2=JOptionPane.showOptionDialog	(null, message, "Number Conversion", 0, 3, null, choices, null);
        return choice2;
    }
    public static void main(String[] args)
    {
        changeJOP();

        int num = enterNum();
        Number n1 = new Number(num);
        System.out.println(n1.getDecimal());
        int choice=0;
        String answer = "";

        while(choice == 0) {
            n1.setDecimal(num);
            choice = baseMenu();
            answer = findAnswer(n1, choice);
            choice = printAnswer(n1, answer, choice);
            if (choice == 0)
                num = enterNum();
        }
    }

}