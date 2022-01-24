import javax.swing.*;
import java.awt.*;

public class GUI {
    public static void main(String[] args){
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(900,600);
        frame.setVisible(true);

        JPanel kontrolki = new JPanel();
        JPanel wykres = new JPanel();
        kontrolki.setBackground(Color.black);
        wykres.setBackground(Color.green);
        kontrolki.setPreferredSize(new Dimension(100,100));
        wykres.setPreferredSize(new Dimension(100,100));

        frame.add(kontrolki,BorderLayout.WEST);
        frame.add(wykres,BorderLayout.EAST);


    }
}
