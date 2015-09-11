
public class Main {
    public static void main(String[] args) {
        FileChooser fileChooser = new FileChooser();

        int res = 0;

        while(fileChooser.files == null) {
            System.out.print("");
        }

        System.out.println();

        for (int i = 0; i < fileChooser.files.length; i++) {
            System.out.println(fileChooser.files[i].getName());
        }
    }
}
