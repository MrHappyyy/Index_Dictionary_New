import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by vyur4 on 11.09.2015.
 */
public class Test {

    public static void main(String[] args) throws IOException{

        ArrayList<String> list = new ArrayList<>();
        ArrayList<String> words = new ArrayList<>();
        
        Scanner file = new Scanner(new File("C:\\Test\\Test.txt"));

        while (file.hasNext())
            list.add(file.nextLine());

        file.close();

        for(int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));

        }

















/*        int k = 50, i = 0;
        String[] s = new String[k];
        Scanner in = new Scanner(new File("C:\\Test\\Test.txt"));
        while(in.hasNext()) {
            s[i] = in.nextLine() + "\r\n";
            i++;
            System.out.println(s);
        }

        for (int j = 0; j < s.length; j++) {
            System.out.println(s[j]);
        }
        in.close();*/
    }
}
