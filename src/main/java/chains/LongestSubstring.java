package chains;

import java.util.Scanner;

public class LongestSubstring {

    public static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        String text1, text2;
        text1 = getInputText("Enter first text: ");
        text2 = getInputText("Enter second text: ");
        System.out.println("Result is: " + find(text1, text2));
    }

    private static String getInputText(String message) {
        System.out.println(message);
        return SCANNER.nextLine();
    }

    private static String find(String text1, String text2) {

        String longestResult = "";
        //if (text1.contains(text2)) return text2;
        //if (text2.contains(text1)) return text1;
        for (int i = 0; i < text1.length(); i++) {
            String result = "";
            for (int j = 0, k = i; j < text2.length() && k < text1.length();
                 j++, k++) {

                if (text1.charAt(k) != text2.charAt(j)) {
                    result = "";
                    k = i;
                    continue;
                }
                result += text2.charAt(j);
                if (result.length() >= longestResult.length()) {
                    longestResult = result;
                }
            }
        }
        return longestResult;
    }
}
