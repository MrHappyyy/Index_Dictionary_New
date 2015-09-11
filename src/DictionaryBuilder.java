import java.io.*;
import java.util.*;

public class DictionaryBuilder {
    private File[] files;
    private Map<String, HashMap<String, Integer>> dictionary = new TreeMap<String, HashMap<String, Integer>>();

    public DictionaryBuilder(File[] files) {
        this.files = files;
    }

    public Map<String, HashMap<String, Integer>> readFileAsList() throws IOException {
        BufferedReader br;
        StringTokenizer tz;

        for (int i = 0; i < files.length; i++) {
            List<String> words = new ArrayList<String>();
            String wordLine = "";
            String[] word;

            Scanner file = new Scanner(new FileReader(files[i]));

            while (file.hasNext())
                wordLine += file.nextLine().toLowerCase();
            file.close();

            word = wordLine.split("[?!*,-.\\;/:)(+\\s]+");

            for (int j = 0; j < word.length; j++) {
                words.add(word[j]);
            }

            StopWords stopWords = new StopWords();
            words = StopWords.removeStopWords(words);

            for (int j = 0; j < words.size(); j++) {
                System.out.print(words.get(j) + "/");
            }
            write(words, files[i].getName());
        }
        return dictionary;
    }

    private void write(List<String> words, String documentsName) {

        for (int i = 0; i < words.size(); i++) {
            HashMap<String, Integer> hashMap = new HashMap<String,Integer>();

            if (dictionary.containsKey(words.get(i))) {
                System.out.println(dictionary.get(words.get(i)));
            } else {
                hashMap.put(documentsName, 1);
                dictionary.put(words.get(i), hashMap);
            }
        }
    }
}