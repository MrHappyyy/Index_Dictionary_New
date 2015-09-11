import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeMap;

public class DictionaryBuilder {
    private File[] files;
    private TreeMap<String, TreeMap<String, Integer>> dictionary;

    public DictionaryBuilder(File[] files) {
        this.files = files;
    }

    public TreeMap readFileAsList() {

        return dictionary;
    }
}