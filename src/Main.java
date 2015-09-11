import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) throws IOException {
        FileChooser fileChooser = new FileChooser();
        TreeMap<String, TreeMap<String, Integer>> dictionary;

        while(fileChooser.files == null) {
            System.out.print("");
        }

        System.out.println();

        DictionaryBuilder dictionaryBuilder = new DictionaryBuilder(fileChooser.files);
        dictionary = dictionaryBuilder.readFileAsList();
    }
}
