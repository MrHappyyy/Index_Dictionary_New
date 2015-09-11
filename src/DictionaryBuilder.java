import java.io.*;
import java.util.*;

public class DictionaryBuilder {
    private File[] files;
    private TreeMap<String, TreeMap<String, Integer>> dictionary;

    public DictionaryBuilder(File[] files) {
        this.files = files;
    }

    public TreeMap readFileAsList() throws IOException {
        BufferedReader br;
        StringTokenizer tz;

        for (int i = 0; i < files.length; i++) {
            List<String> words = new ArrayList<String>();
            List<String> newWords = new ArrayList<String>();
            String wordLine = "";
            String[] word;

            Scanner file = new Scanner(new FileReader(files[i]));

            while (file.hasNext())
                wordLine += file.nextLine();
            file.close();

            word = wordLine.split("[\\s]+");

            for (int j = 0; j < word.length; j++) {
                words.add(word[j]);
            }

            for (int j = 0; j < words.size(); j++) {
                System.out.print(words.get(j) + "/");
            }
            System.out.println();

            StopWords stopWords = new StopWords();
            newWords = stopWords.removeStopWords(words);

            for (int j = 0; j < newWords.size(); j++) {
                System.out.print(newWords.get(j) + "/");
            }
            System.out.println();
        }
        return dictionary;
    }
}