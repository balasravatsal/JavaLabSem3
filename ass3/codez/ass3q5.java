import java.io.*;

public class ass3q5 {
    public static void main(String[] args) throws Exception {
        BufferedReader bufRead = new BufferedReader(new FileReader("student5.txt"));
        BufferedWriter bufWrite = new BufferedWriter(new FileWriter("newStudent5.txt"));
        int i;

        do {
            i = bufRead.read();
            if (i != -1) {
                if (Character.isUpperCase((char) i)) {
                    bufWrite.write(Character.toLowerCase((char) i));
                } else {
                    bufWrite.write((char) i);
                }
            }
        } while (i != -1);
        bufRead.close();
        bufWrite.close();
        System.out.println("New Student File");
        BufferedReader bfr = new BufferedReader(new FileReader("newStudent5.txt"));
        int ir = 0;
        while ((ir = bfr.read()) != -1) {
            System.out.print((char) ir);
        }
        bfr.close();
    }
}