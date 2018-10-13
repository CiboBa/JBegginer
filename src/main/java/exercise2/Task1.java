package exercise2;

import java.util.Scanner;
import java.util.stream.IntStream;

public class Task1 {

    public static void main(String[] args) {

        int input = getFromuser();
        if (checkIfInputIsIncorrect(input)) return;
        printEverySecond(input);
        printSequence2(input);
        printSequence3(input);
        //printSequence4(input);
    }

    //private static void printSequence4(int n) {    }

    private static void printSequence3(int n) {
        for (int i = 1, result = 2, multiplier = 1; i <= n; i++, result += 2 * multiplier) {
            if (result == 8) {
                multiplier = -1;
            } else if (result == 2) {
                multiplier = 1;
            }
            System.out.print(result + " ");
        }
        printLines(newLine());
        int multiplier = 1;
        System.out.print("2 ");
        for (int i = 1, result = 4; i < n; i++, result += 2 * multiplier) {
            if (i % 3 == 0) multiplier *= -1;
            System.out.print(result + " ");
        }
        printLines(newLine());
    }

    private static String newLine() {
        return "\n------------";
    }

    private static void printLines(String s) {
        System.out.println(s);
    }

    private static void printSequence2(int n) {
        for (int i = 1, k = -1, j = 1; i <= n; k += j, i++) {
            j *= 2;
            System.out.print(k + " ");
        }
        printLines(newLine());
    }

    private static void printEverySecond(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.print(i * 2 - 1 + " ");
        }
        printLines(newLine());
        for (int i = 1; i <= 2 * n - 1; i += 2) {
            System.out.print(i + " ");
        }
        printLines(newLine());
        //LAMBDA WAY
        IntStream.range(1, n + 1).forEach(t -> System.out.print(t * 2 - 1 + " "));
        printLines(newLine());
    }

    private static boolean checkIfInputIsIncorrect(int fromuser) {
        if (fromuser < 1 || fromuser > 20) {
            printLines("Wrong number!!!");
            return true;
        }
        return false;
    }

    private static int getFromuser() {
        printLines("Enter a number n: ");
        return new Scanner(System.in).nextInt();
    }


}
