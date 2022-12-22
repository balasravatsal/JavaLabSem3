import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class ass4q2 {
    JFrame f;
    JLabel l;

    public void initGUI() {
        f = new JFrame();
        l = new JLabel();
        Container c = f.getContentPane();
        c.setLayout(new BorderLayout());
        c.add(l, BorderLayout.NORTH);
        MouseHandle m = new MouseHandle();
        WindowHandle w = new WindowHandle();
        f.addMouseMotionListener(m);
        f.addWindowListener(w);
        f.setSize(300, 350);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
    private class WindowHandle extends WindowAdapter {
        public void windowClosing(WindowEvent we) {
            JOptionPane.showMessageDialog(null,
                    "GOOD BYE");
            System.exit(0);
        }
    }
    private class MouseHandle extends MouseMotionAdapter {
        public void mouseMoved(MouseEvent me) {
            int x;
            int y;
            x = me.getX();
            y = me.getY();
            l.setText("Moved At[" + x + "],[" + y + "]");
        }
    }
public ass4q2()
{
initGUI();
}
    public static void main(String args[]) {
        ass4q2 e = new ass4q2();
    }
}
