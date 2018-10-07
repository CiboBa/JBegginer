package exercise1;

import java.util.Arrays;
import java.util.Scanner;

public class PrimeNumberChecker {

    public static void main(String[] args) {
        System.out.println("Insert a natural number (>=0)");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        /*long startTime = System.currentTimeMillis();
        printPrimes(n);
        long endTime = System.currentTimeMillis();
        System.out.println(((double) (endTime - startTime)) / 1_000);*/
        long startTime1 = System.currentTimeMillis();
        printEratostenesPrimes(n);

        long endTime1 = System.currentTimeMillis();
        System.out.println(((double) (endTime1 - startTime1)) / 1_000);
    }

    private static void printEratostenesPrimes(int n) {
        boolean[] primes = new boolean[n+1];

        //IntStream.range(1, n).forEach(t -> primes[t] = true);
        Arrays.fill(primes, true);
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (primes[i]) {
                for (int j = i * i; j <= n; j += i) primes[j] = false;
            }
        }

        for (int i = 2; i <= n; i++) {
            if (primes[i]) {
                System.out.println(i);
            }
        }
    }

    private static void printPrimes(int n) {
        for (int i = 2; i < n; i++) {
            if (isPrime(i)) {
                System.out.println(i);
            }
        }
    }

    private static boolean isPrime(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}
