import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class New_Dictionary_Builder {
    File[] files;

    public New_Dictionary_Builder(File[] files) throws FileNotFoundException {
        this.files = files;
        readFileAsList();
    }

    private void readFileAsList() throws FileNotFoundException {

        for (int i = 0; i < files.length; i++) {
            ArrayList words = new ArrayList();
            String line = "";
            String[] wordsLine;
            Scanner file = new Scanner(files[i]);

            while (file.hasNext())
                line += file.nextLine();
            file.close();

            System.out.println(line);

            wordsLine = line.split("[,.;/\'\"\\:()!?\\s]+");

            for (int j = 0; j < wordsLine.length; j++) {
                System.out.print(wordsLine[i]);
                words.add(wordsLine[i]);
            }
            System.out.println();

            for (int j = 0; j < words.size(); j++) {
                System.out.print(words.get(i) + "|");
            }
        }
    }
}