package exercise2;


import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {

        int height = new Scanner(System.in).nextInt();
        if (checkIfInputIsIncorrect(height)) return;
        drawTriangle(height);
        drewX(height);
        drawSquare(height);
        drawBackslash(height);
    }

    private static void drawBackslash(int n) {
        for (int i = 0; i < n; i++) {
            System.out.println();
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    System.out.print("*");
                } else System.out.print(" ");
            }
        }
        System.out.println();
    }

    private static void drawSquare(int n) {
        for (int i = 0; i < n; i++) {
            System.out.println();
            for (int j = 0; j < n; j++) {
                if (i * j == 0 || i == n - 1 || j == n - 1) {
                    System.out.print("*");
                } else System.out.print(" ");
            }
        }
        System.out.println();
    }

    private static void drewX(int n) {
        for (int i = 0; i < n; i++) {
            System.out.println();
            for (int j = 0; j < n; j++) {
                if (i == j || i + j + 1 == n) {
                    System.out.print("*");
                } else System.out.print(" ");
            }
        }
        System.out.println();
    }

    private static void drawTriangle(int n) {
        for (int i = 0; i < n; i++) {
            System.out.println();
            for (int j = 0; j < n; j++) {
                if (j <= i) {
                    System.out.print("*");
                } else System.out.print(" ");
            }
        }
        System.out.println();
    }

    private static boolean checkIfInputIsIncorrect(int fromuser) {
        if (fromuser < 1 || fromuser > 20) {
            System.out.println("Wrong numbers!!!");
            return true;
        }
        return false;
    }
}
