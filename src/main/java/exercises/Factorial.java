package exercises;

import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {

        calculateFactorial();

    }

    private static void calculateFactorial() {
        int i, fact = 1;
        System.out.println("Insert a natural number (>=0)");
        int n = new Scanner(System.in).nextInt();
        if (n < 0) {
            System.out.println("Incorrect number.");
        } else {
            for (i = 2; i <= n; i++) {
                fact = fact * i;
            }
            System.out.println("Factorial of " + n + " = " + fact);
        }
    }
}
