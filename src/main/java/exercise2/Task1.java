package exercise2;

import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {

        System.out.println("Enter a number: ");
        int fromuser= new Scanner(System.in).nextInt();
        printEverySecond(fromuser);
    }

    private static void printEverySecond(int n) {
        if (n >20){
            System.out.println("Wrong number");
        }else for (int i=1; i<=n; i+=2){
            System.out.println(i);
        }
    }

    /*private static void printEverySecond() {
        for (int i=1; i<=20; i+=2){
            System.out.println(i);
        }
    }*/
}
