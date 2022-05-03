import java.awt.Color;
import java.awt.Font;
import java.util.ArrayList;
import java.util.Collections;

import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.plaf.FontUIResource;

public class NumberList
{
    public static void changeJOP()
    {
        UIManager.put("Label.font", new FontUIResource
                (new Font("Tahoma", Font.BOLD, 8)));
        UIManager.put("OptionPane.messageForeground",
                new Color(72,61,139));
        UIManager.put("TextField.background", new Color(135,206,235));
        UIManager.put("TextField.foreground", new Color(72,61,139));
        UIManager.put("TextField.font", new FontUIResource
                (new Font("Tahoma", Font.ITALIC, 8)));

        UIManager.put("Panel.background",new Color(255,248,220));
        UIManager.put("OptionPane.background",new Color(112,105,105));
        //132,112,255
        UIManager.put("Button.background",new Color(152,245,255));
        UIManager.put("Button.foreground", new Color(112,105,105));
        UIManager.put("Button.font", new FontUIResource
                (new Font("Comic Sans MS", Font.BOLD, 8)));

    }


    public static void fillList(ArrayList<Number>list)
    {
        int num=0;
        for(int i=0; i<10; i++) {
            num=(int)(Math.random()*90+10);
            list.add(new Number(num));
        }
    }
    public static void printList(ArrayList<Number>list)
    {
        String answer = "";
        for(Number n: list) {
            answer += n +"\n-------------------\n";
        }
        JOptionPane.showMessageDialog(null, answer);
    }
    public static void main(String[] args)
    {
        changeJOP();
        int num=0;
        String answer="";
        ArrayList<Number> list = new ArrayList<Number>();

        fillList(list);
        printList(list);
        Collections.sort(list);
        printList(list);
    }
}