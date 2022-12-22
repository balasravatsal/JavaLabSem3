import java.awt.*;
import javax.swing.*;
import java.util.*;

class ass4q7 {
    JLabel L1, L2, L3;
    JTextField tf1, tf2, tf3;

    public ass4q7() {
        initGui();
    }

    public void initGui() {
        Scanner sc = new Scanner(System.in);
        JFrame f = new JFrame("STUDENT INFO");
        L1 = new JLabel("Roll no");
        L2 = new JLabel("Name");
        L3 = new JLabel("Branch");
        tf1 = new JTextField(20);
        tf2 = new JTextField(20);
        tf3 = new JTextField(20);
        System.out.println("Enter roll no");
        String roll = sc.next();
        System.out.println("Enter name");
        String name = sc.next();
        System.out.println("Enter branch");
        String branch = sc.next();
        tf1.setText(roll);
        tf1.setText(name);
        tf1.setText(branch);
        Container c = f.getContentPane();
        c.setLayout(new FlowLayout());
        c.add(L1);
        c.add(tf1);
        c.add(L2);
        c.add(tf2);
        c.add(L3);
        c.add(tf3);
        f.setSize(300, 300);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        sc.close();
    }

    public static void main(String args[]) {
        ass4q7 s1 = new ass4q7();
    }
}
