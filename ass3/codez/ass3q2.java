import java.io.*;

public class ass3q2 {

    public static void main(String args[]){
        FileReader fr = null;
        BufferedReader br = null;
        FileWriter fw = null;
        // PrintWriter pw = null;

        try{
            fr = new FileReader("inFile.txt");
            br = new BufferedReader(fr);
            fw = new FileWriter("outFile.txt");
            // pw = new PrintWriter(fw);
            String s = br.readLine();

            while(s!=null) {
                String s1 = s.toUpperCase();
                fw.write(s1);
                s = br.readLine();
            }
        }
        catch(Exception e) {
            System.out.println("ErrorOccuredDuringTaskExecution");
        }
    }
}
