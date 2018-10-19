package sequences;

import java.util.Scanner;

public class AbsoluteValue {

    public static void main(String[] args) {

        calculateAbsoluteValue();
    }

    private static void calculateAbsoluteValue() {
        System.out.println("Enter a number to check for absolute value: ");
        int n = new Scanner(System.in).nextInt();
        if (n >= 0) {
            System.out.println("The absolute is: " + n);
        } else
            System.out.println("The absolute is: " + (-n));
    }
}
