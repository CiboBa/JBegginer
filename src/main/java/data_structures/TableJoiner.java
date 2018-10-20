package data_structures;

import java.util.*;

public class TableJoiner {

    public static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        int n = getinputNumber("Enter number of arrays: ");
        int[][] tables = new int[n][];

        for (int i = 0; i < n; i++) {
            int size = getinputNumber("Enter dimension: ");
            tables[i] = new int[size];
            fill(tables[i]);
        }
        for (int[] table : tables) {
            System.out.println(Arrays.toString(table));
        }
        System.out.println(Arrays.toString(tables));
        int[] distindtTable = join(tables);
        System.out.println("Restul: " + Arrays.toString(distindtTable));
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

    private static int getinputNumber(String message) {
        System.out.println(message);
        return SCANNER.nextInt();
    }
}
