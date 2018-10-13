package exercises;

import java.util.Scanner;

public class FactorialRecursive {

    public static void main(String args[]) {

        System.out.println("Enter a number: ");
        int counter = new Scanner(System.in).nextInt();
        System.out.printf("%d! = %d", counter, factorial(counter));

    }

    private static int factorial(int number) {
        if (number <= 1)
            return 1;
        else
            return number * factorial(number - 1);
    }
}
