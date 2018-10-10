package exercise1;

import java.util.Scanner;

public class FibonacciSequence {

    public static void main(String[] args) {
        System.out.println("Check exact value from Fibonacci sequence. Enter the position number: ");
        int counter = new Scanner(System.in).nextInt();
        System.out.printf("Fibonacci sequence %d = %d", counter, value(counter));
    }

    private static long value(long number) {
        if (number == 0)
            return 0;
        else if (number <= 2)
            return 1;
        else
            return value(number - 1) + value(number - 2);
    }
}
