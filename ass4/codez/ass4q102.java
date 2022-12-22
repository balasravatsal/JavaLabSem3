// CardLayout
// question 10 part 2

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class ass4q102 extends JFrame implements
        ActionListener {
    CardLayout crd;

    JButton btn1, btn2, btn3;
    Container cPane;

    ass4q102() {
        cPane = getContentPane();

        crd = new CardLayout();
        cPane.setLayout(crd);

        btn1 = new JButton("Java");
        btn2 = new JButton("C++");
        btn3 = new JButton("Python");
   
        btn1.addActionListener(this);
        btn2.addActionListener(this);
        btn3.addActionListener(this);
        cPane.add("a", btn1); 
        cPane.add("b", btn2); 
        cPane.add("c", btn3); 
    }

public void actionPerformed(ActionEvent e)
{
crd.next(cPane);
}

    public static void main(String argvs[]) {
        ass4q102 crdl = new ass4q102();

        crdl.setSize(300, 300);
        crdl.setVisible(true);
        crdl.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
