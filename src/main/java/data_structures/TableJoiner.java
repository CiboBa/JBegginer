package data_structures;

import java.util.*;

public class TableJoiner {

    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        int n = getInputNumber("Enter number of arrays: ");
        int[][] tables = new int[n][];

        for (int i = 0; i < n; i++) {
            int size = getInputNumber("Enter dimension: ");
            tables[i] = new int[size];
            fill(tables[i]);
        }
        for (int[] table : tables) {
            System.out.println(Arrays.toString(table));
        }
        int[] distindtTable = join(tables);
        System.out.println("Result: " + Arrays.toString(distindtTable));
    }

    private static void fill(int[] table) {
        Random random = new Random();
        for (int i = 0; i < table.length; i++) {
            table[i] = random.nextInt(15);
        }
    }

    private static int[] join(int[][] tables) {
        Set<Integer> values = new HashSet<>();
        for (int[] table : tables) {
            for (int value : table) {
                values.add(value);
            }
        }
        int[] result = new int[values.size()];
        Iterator<Integer> iterator = values.iterator();
        int counter = 0;
        while (iterator.hasNext()) {
            result[counter++] = iterator.next();
        }
        return result;
    }

    private static int getInputNumber(String message) {
        System.out.println(message);
        return SCANNER.nextInt();
    }
}
