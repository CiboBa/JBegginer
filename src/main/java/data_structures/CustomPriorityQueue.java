package data_structures;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Random;

public class CustomPriorityQueue<T> {
    private Queue<T> elements = new PriorityQueue<>();

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
        CustomPriorityQueue<Integer> priority = new CustomPriorityQueue<>();

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

        CustomPriorityQueue<String> priority2 = new CustomPriorityQueue<>();
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
    }
}
