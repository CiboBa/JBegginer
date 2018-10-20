package data_structures;

import java.util.Random;
import java.util.Scanner;

public class ArrayWithRandoms {

    public static void main(String[] args) {
        int n = getInput();
        array(n);
        print2(array(n));

        checkOrder(array(n), true);
        System.out.println("Is the string not decreasing?: " + checkOrder(array(n), true));
        System.out.println("Is the string not increasing?: " + checkOrder(array(n), false));
    }

    private static boolean checkOrder(int[] table, boolean isGreater) {
        boolean result = true;
        for (int i = 1; i < table.length; i++) {
            if (isGreater && table[i] < table[i - 1]) {
                return false;
            }
            if (!isGreater && table[i] > table[i - 1]) {
                return false;
            }
        }
        return result;
    }

    private static void print2(int[] table) {
        for (int i = 0; i < table.length; i++) {
            System.out.print(table[i] + " ");
        }
        System.out.println();
    }

    private static int[] array(int n) {
        int[] table = new int[n];
        Random random = new Random();
        for (int i = 0; i < table.length; i++) {
            table[i] = random.nextInt(n);
        }
        return table;
    }

    private static int getInput() {
        System.out.println("Enter array dimension: ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
}


