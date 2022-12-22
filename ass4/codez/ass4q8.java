import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ass4q8 {
    private static JDialog d;

    ass4q8() {
        JFrame f = new JFrame();
        d = new JDialog(f,
                "Dialog Example", true);
        d.setLayout(new FlowLayout());
        JButton b = new JButton("OK");
        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                ass4q8.d.setVisible(false);
            }
        });
        d.add(new JLabel("Click button to continue."));
        d.add(b);
        d.setSize(300, 300);
        d.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String args[]) {
        new ass4q8();
    }
}
