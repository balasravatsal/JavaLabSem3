import javax.swing.JOptionPane;

public class PercentageMark {
    public static void main(String args[])
    {
        String s1 = JOptionPane.showInputDialog("Enter Marks of English");
        int a = Integer.parseInt(s1);

        String s2 = JOptionPane.showInputDialog("Enter Marks of Maths");
        int b = Integer.parseInt(s2);
        
        String s3 = JOptionPane.showInputDialog("Enter Marks of SST");
        int c = Integer.parseInt(s3);        

        String s4 = JOptionPane.showInputDialog("Enter Marks of Science");
        int d = Integer.parseInt(s4);        

        String s5 = JOptionPane.showInputDialog("Enter Marks of Comp");
        int e = Integer.parseInt(s5);        

        String s6 = JOptionPane.showInputDialog("Enter Marks of Gujarati");
        int f = Integer.parseInt(s6); 


        int percent = (a+b+c+d+e+f)/6;
        JOptionPane.showMessageDialog(null, "Percentage is : " + percent);

    }
}
