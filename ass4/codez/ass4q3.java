
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class ass4q3 extends JFrame implements KeyListener {
    Container c;
    JTextArea ta;
    String str = "";

    ass4q3() {
        c = getContentPane();
        ta = new JTextArea("Press a Key");
        ta.setFont(new Font("Arial", Font.BOLD, 30));
        c.add(ta);
        ta.addKeyListener(this);
    }

    public void keyPressed(KeyEvent ke) {
        int keycode = ke.getKeyCode();
        if (keycode == KeyEvent.VK_F1)
            str += "F1 key";
        if (keycode == KeyEvent.VK_F2)
            str += "F2 key";
        if (keycode == KeyEvent.VK_F3)
            str += "F3 key";
        if (keycode == KeyEvent.VK_PAGE_UP)
            str += "PAGE UP";
        if (keycode == KeyEvent.VK_PAGE_DOWN)
            str += "PAGE DOWN";
        if (keycode == KeyEvent.VK_HOME)
            str += "HOME";
        if (keycode == KeyEvent.VK_END)
            str += "END";
        ta.setText(str);
        str = "";
    }

    public void keyReleased(KeyEvent ke) {
    }

    public void keyTyped(KeyEvent ke) {
    }

    public static void main(String args[]) {
        ass4q3 kbe = new ass4q3();
        kbe.setSize(400, 400);
        kbe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        kbe.setVisible(true);
    }
}