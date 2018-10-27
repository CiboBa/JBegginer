package sorting_algorhitms;

import java.util.*;

public class EmbeddedSort {

    public static void main(String[] args) {

        List<Integer> numbers = generateNumbers();
        sort(numbers);
        System.out.println(numbers);
    }

    private static void sort(List<Integer> numbers) {
        Collections.sort(numbers, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                //-1 gdy o1 jest do wstawienia z lewej
                //1 gdy o2 jest do wstawienia z lewej
                //0 gdy liczby są równe, nic nie zmieniamy

                //alteratywna metoda
                if (o1 % 2 == o2 % 2) {
                    return o1.compareTo(o2);
                } else if (o1.compareTo(o2) != 0) {
                    return (o1 % 2 < o2 % 2) ? -1 : 1;
                }
                return 0;
                }

                // moje rozwiązanie
                /*if (o1 % 2 == 0 && o2 % 2 != 0) {
                    return -1;
                }
                if (o1 % 2 != 0 && o2 % 2 == 0) {
                    return 1;
                }
                return o1.compareTo(o2);
            }*/
        });
    }

    private static List<Integer> generateNumbers() {
        List<Integer> numbers = new ArrayList<>();
        final int n = 50;
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            numbers.add(i, random.nextInt(100));
        }
        return numbers;
    }
}
