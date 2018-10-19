package chains;

import java.util.Scanner;

public class PalindromOccurrences {

    public static void main(String[] args) {
        String text = getInputText("Enter some text: ");
        printAll(text);
    }

    private static void printAll(String text) {

        for (int i = 1; i < text.length(); i++) {
            for (int j = 1, k = i; i - j >= 0 && i + j < text.length(); j++, k--) {
                if (text.charAt(i - j) != text.charAt(i + j)) {
                    break;
                }
                System.out.println(text.substring(i - j, i + j + 1));
            }
        }
    }


    private static String getInputText(String message) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(message);
        return scanner.nextLine();
    }
}