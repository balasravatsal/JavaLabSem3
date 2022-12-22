import java.io.*;

public class ass3q6 {
    public static void main(String[] args) throws IOException {
        String mes1 = "Hello, FileReader and FileWriter was performed";

        FileWriter fw = new FileWriter("autoWrite6.txt");
        for (int i = 0; i < mes1.length(); i++) {
            fw.write(mes1.charAt(i));
        }
        System.out.println("Writing successful");
        fw.close();
    }
}