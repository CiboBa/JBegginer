package sequences;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CalculateFromFile {

    public static final String FILE_PATH = "C:\\Users\\Bartek\\IdeaProjects\\JBegginer\\liczby.txt";

    public static void main(String[] args) {

        calculate();
    }

    private static void calculate() {
        try {
            Scanner scan = new Scanner(new File(FILE_PATH));
            int sum = 0;
            while (scan.hasNextInt()) {
                int digit = scan.nextInt();
                sum += digit;
                System.out.println(sum);
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Exeption with reading file" + ex);
        }
    }
}
