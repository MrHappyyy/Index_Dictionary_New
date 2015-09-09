
public class Main {
    public static void main(String[] args) {
        FileChooser fileChooser = new FileChooser();

        while(fileChooser.files == null);

        for (int i = 0; i < fileChooser.files.length; i++) {
            System.out.println(fileChooser.files[i].getName());
        }
    }
}
