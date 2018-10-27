package data_structures;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class StringIntMap {

    private static final File FILE = new File("stringint.txt");

    public static void main(String[] args) throws FileNotFoundException {

        Map<String, Integer> stringint = readMap();
        System.out.println(stringint);

    }

    private static Map<String, Integer> readMap() throws FileNotFoundException {
        Map<String, Integer> stringint = new HashMap<>();
        Scanner scanner = new Scanner(FILE);
            Integer value = 0;
            while (scanner.hasNextLine()) {
                String key = scanner.next();
                value++;
                stringint.put(key, value);
            }
            scanner.close();
            return stringint;

    }
}
