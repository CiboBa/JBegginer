package sequences;

public class SummingArrayElements {

    public static void main(String[] args) {

        int[] array = {4, 1, 6, 1, 3};
        int[] array2 = {1, 5, 2, 19, 52, 0};

        print(array);
        print(array2);
    }

    private static void print(int[] array) {
        System.out.println(sumElements(array));
    }

    private static int sumElements(int[] a) {
        int result = 0;
        for (int i = 0; i < a.length; i++) {
            result = result + a[i];
        }
        return result;
    }
}
