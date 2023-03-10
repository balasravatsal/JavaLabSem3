import java.io.*;

public class ass3q1 {
    public static void main(String args[]) {
        FileReader fr = null;

        int sentences = 0, words = 1, characters = 0;
        char[] terminators = { '.', '?', '!' };
        try {
            fr = new FileReader("inFile.txt");

            BufferedReader br = new BufferedReader(fr);
            for (char[] s = (br.readLine()).toCharArray(); s != null; s = (br.readLine()).toCharArray()) {
                for (char c : s) {
                    characters++;
                    for (char x : terminators)
                        if (x == c)
                            sentences++;
                    if (c == ' ')
                        words++;
                }
            }
            br.close();
        } catch (Exception e) {
            System.out.println(fr);
        }
        System.out.println("Sentences: " + sentences);
        System.out.println("Words: " + words);
        System.out.println("Characters: " + characters);

    }
}