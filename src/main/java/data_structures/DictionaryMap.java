package data_structures;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DictionaryMap {

    private static final File FILE = new File("dictionary.txt");

    public static void main(String[] args) throws FileNotFoundException {

        Map<String, String> dictionary = readWords();

        String word = getWord();
        System.out.println(translate(dictionary, word));
        System.out.println(dictionary);
    }

    private static String translate(Map<String, String> dictionary, String word) {
        return dictionary.get(word);
    }

    private static String getWord() {
        Scanner scanner = new Scanner(System.in);
        return scanner.next();
    }

    private static Map<String, String> readWords() throws FileNotFoundException {
        Map<String, String> dictionary = new HashMap<>();
        Scanner scanner = new Scanner(FILE);
        while (scanner.hasNextLine()) {
            String key = scanner.next();
            String value = scanner.next();
            dictionary.put(key, value);
        }
        scanner.close();
        return dictionary;
    }
}
