package chains;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringOccurrences {

    public static void main(String[] args) {

        String text = getInputText();
        String key = getInputKey();

        findAllOccurrences(text, key);

    }

    private static void findAllOccurrences(String text, String key) {
        Pattern pattern = Pattern.compile(key);
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            System.out.print("[{" + matcher.start() + "," + (matcher.end() - 1) + "}]");
            System.out.println(matcher.group());
        }
        matcher.reset();
    }

    private static String getInputKey() {
        System.out.println("Enter the key to find: ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    private static String getInputText() {
        System.out.println("Enter a sentence: ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
}
