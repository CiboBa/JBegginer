package data_structures;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ArraysSummary {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        int[] table1 = fill(n);
        int[] table2 = fill(m);
        System.out.println(Arrays.toString(table1));
        System.out.println(Arrays.toString(table2));
        System.out.println(Arrays.toString(tableSum(table1, table2)));

    }

    private static int[] tableSum(int[] table1, int[] table2) {
        int[] tableSum = new int[Math.max(table1.length, table2.length)];
        for (int i = 0; i < table1.length; i++) {
            tableSum[i] = table1[i] + table2[i];
        }
        return tableSum;
    }

    private static int[] fill(int n) {
        int[] table1 = new int[n];
        for (int i = 0; i < n; i++) {
            Random random = new Random();
            table1[i] = random.nextInt(100);
        }
        return table1;
    }

}
