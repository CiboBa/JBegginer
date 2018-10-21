package data_structures;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Random;

public class CustomPriorityQueue<T> {
    private Queue<T> elements = new PriorityQueue<>();

    //private CustomPriorityQueue(){

    //}
    private CustomPriorityQueue(Comparator comparator) {
        elements = new PriorityQueue<T>(comparator);
    }

    private void push(T element) {
        elements.add(element);
    }

    private void pop() {
        elements.poll();
    }

    private T front() {
        return elements.peek();
    }

    private boolean isEmpty() {
        return elements.isEmpty();
    }

    private void clear() {
        while (!elements.isEmpty()) {
            T element = elements.poll();
            System.out.println(element);
        }
    }

    private int size() {
        return elements.size();
    }

    public static void main(String[] args) {
        CustomPriorityQueue<Integer> priority = new CustomPriorityQueue<>(getNumberComparator());

        Random random = new Random();
        priority.push(random.nextInt(10));
        priority.push(random.nextInt(10));
        priority.push(random.nextInt(10));
        priority.push(random.nextInt(10));
        priority.push(random.nextInt(10));
        priority.push(random.nextInt(10));
        priority.push(random.nextInt(10));
        priority.push(random.nextInt(10));
        priority.push(random.nextInt(10));
        priority.push(5);
        priority.pop();
        System.out.println("Last element is: " + priority.front());
        System.out.println("Queue size is: " + priority.size());
        System.out.println("Is queue empty: " + priority.isEmpty());
        priority.clear();
        System.out.println("---------------");

        CustomPriorityQueue<String> priority2 = new CustomPriorityQueue<>(getNumberComparator());
        priority2.push("Ala");
        priority2.push("karlo");
        priority2.push(".micha .");
        priority2.push("WIEsiek");
        priority2.push("merol");
        priority2.push("karzeł");
        priority2.push("-ono");
        priority2.push("berberys");
        priority2.push("Alina");
        priority2.push("Aline");
        System.out.println("Last element is: " + priority2.front());
        System.out.println("Queue size is: " + priority2.size());
        priority2.clear();
        System.out.println("Is queue empty: " + priority2.isEmpty());
        System.out.println("---------------");

        String s1 = "";
        String s2 = "";

        System.out.println(s1.compareTo(s2));
    }

    private static Comparator<Integer> getNumberComparator() {
        return new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if (o1 % 2 == o2 % 2) {
                    return o1 < o2 ? -1 : 1;
                }
                if (o1 % 2 == 0) {
                    return -1;
                }

                if (o2 % 2 == 0) {
                    return 1;
                }
                return 0;
            }

        };
    }
}
