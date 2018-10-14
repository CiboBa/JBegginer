package sequences;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class DifferentNumbers {

    public static final String FILE_PATH2 = "C:\\Users\\Bartek\\IdeaProjects\\JBegginer\\liczby2.txt";

    public static void main(String[] args) {

        checkHowManyDifferentNumbers();
    }

    private static void checkHowManyDifferentNumbers() {
        int[] tab = new int[10];
        Arrays.fill(tab, 0);
        try {
            Scanner scanner = new Scanner(new File(FILE_PATH2));
            while (scanner.hasNextInt()) {
                int digit = scanner.nextInt();
                tab[digit - 1]++;
            }
            checkDistinctCount(tab);
            checkMostlyFrequent(tab);
        } catch (FileNotFoundException ex) {
            System.out.println("Exception with reading file" + ex);
        }

    }

    private static void checkMostlyFrequent(int[] tab) {

    }

    private static void checkDistinctCount(int[] tab) {
        int result = 0;
        for (int i = 1; i <= 10; i++) {
            if (tab[i] != 0) {
                result++;
            }
        }
        System.out.println("Wystąpiło " + result + " różnych liczb.");
    }

}
