package sorting_algorhitms;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 8, 5, 3, 8};
        sort(numbers);
        print(numbers);
    }

    private static void print(int[] numbers) {
        System.out.println(Arrays.toString(numbers));
    }

    private static void sort(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length - 1; j++) {
                if (numbers[j] > numbers[j+1]) {
                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }
        }
    }


}
