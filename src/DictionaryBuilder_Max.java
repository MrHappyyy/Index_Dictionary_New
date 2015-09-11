import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class DictionaryBuilder_Max {
    TreeMap<String, TreeMap<String, Integer>> dictionary;
    File[] files;

    public DictionaryBuilder_Max(TreeMap<String, TreeMap<String, Integer>> dictionary, File[] files) {
        this.dictionary = dictionary;
        this.files = files;
    }

    public void readFileAsList() throws Exception {

        BufferedReader br;
        StringTokenizer tz;
        String word = "";
        int wordsCount = 0;
        int allWordsCounter = 0;

        for (int documentNumber = 0; documentNumber < files.length; documentNumber++) {
            br = new BufferedReader(new FileReader(files[documentNumber]));
            try {
                String strLine = null;
                while ((strLine = br.readLine()) != null) {
                    strLine.toLowerCase();
                    tz = new StringTokenizer(strLine);

                    while(tz.hasMoreTokens()) {
                        word = tz.nextToken();
                        wordsCount += countWordsInList(word);
                        //dictionary.put(word, wordsCount);
                        allWordsCounter += wordsCount;
                    }
                }
            } finally {
                br.close();
            }
        }
    }

    private int countWordsInList(String word) {
        if (dictionary.containsKey(word)) {
            dictionary.get(word);
            return 1;
        }

        return 0;
    }

//    private List<String> getMainWords(List <String> wordsList){
//        List<String> tokens = new ArrayList<String>();
//
//        for ( String text : wordsList) {
//            StringTokenizer tz = new StringTokenizer(text);
//            while(tz.hasMoreTokens()) {
//                tokens.add(tz.nextToken());
//            }
//        }
//
//
//        return StopWords.removeStopWords(tokens);
//    }
}
