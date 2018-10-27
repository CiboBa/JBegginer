package sorting_algorhitms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class EmbededSort {

    public static void main(String[] args) {

        List<Integer> numbers = generateNumbers();
        sort(numbers);
        System.out.println(numbers);
    }

    private static void sort(List<Integer> numbers) {
        Collections.sort(numbers);
    }

    private static List<Integer> generateNumbers() {
        List<Integer> numbers = new ArrayList<>();
        final int n = 50;
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            numbers.add(i, random.nextInt(100));
        }
        return numbers;
    }
}
