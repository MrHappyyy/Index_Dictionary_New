import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        FileChooser fileChooser = new FileChooser();

        while(fileChooser.files == null) {
            System.out.print("");
        }

        System.out.println();

        DictionaryBuilder dictionaryBuilder = new DictionaryBuilder(fileChooser.files);
    }
}
