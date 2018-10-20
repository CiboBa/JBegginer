package data_structures;

import java.util.Scanner;

public class ArrayWithFibonacci {

    public static void main(String[] args) {
        int n = getInput();
        print(fillArray(n));
    }

    private static int getInput() {
        System.out.println("Enter array dimension: ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    private static void print(int[] table) {
        for (int i = 0; i < table.length; i++) {
            System.out.print(table[i] + " ");
        }
        System.out.println();
    }

    private static int[] fillArray(int n) {
        int[] table = new int[n];
        table[0] = 1;
        table[1] = 1;
        for (int i = 2; i < n; i++) {
            table[i] = table[i - 1] + table[i - 2];
        }
        return table;
    }

}
