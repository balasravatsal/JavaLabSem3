//Border Layout

import java.awt.*;
import javax.swing.*;

public class ass4q91 {
    JFrame myFrame;
    JButton b1, b2, b3, b4, b5, b6;

    public void initGUI() {
        myFrame = new JFrame();
        Container c = myFrame.getContentPane();
        c.setLayout(new BorderLayout());
        b1 = new JButton("UP");
        b2 = new JButton("DOWN");
        b3 = new JButton("OK");
        b4 = new JButton("RIGHT");
        b6 = new JButton("LEFT");
        c.add(b1, BorderLayout.NORTH);
        c.add(b2, BorderLayout.SOUTH);
        c.add(b3, BorderLayout.CENTER);
        c.add(b4, BorderLayout.EAST);
        c.add(b6, BorderLayout.WEST);
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myFrame.setSize(150, 200);
        myFrame.setVisible(true);
    }

    public static void main(String args[]) {
        ass4q91 g1 = new ass4q91();
        g1.initGUI();
    }
}