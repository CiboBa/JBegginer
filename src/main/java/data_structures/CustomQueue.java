package data_structures;

import java.util.LinkedList;

public class CustomQueue<T> {

    private LinkedList<T> elements = new LinkedList<>();

    private void push(T element) {
        elements.addLast(element);
    }

    private void pop() {
        elements.removeFirst();
    }

    private T front() {
        return elements.getLast();
    }

    private boolean isEmpty() {
        return elements.isEmpty();
    }

    private void clear() {
        while (!elements.isEmpty()) {
            T element = elements.pop();
            System.out.println(element);
        }
    }

    private int size() {
        return elements.size();
    }

    public static void main(String[] args) {
        CustomQueue<Integer> queue = new CustomQueue<>();

        queue.push(1);
        queue.push(2);
        queue.push(3);
        queue.push(4);
        queue.pop();
        System.out.println("Last element is: " + queue.front());
        System.out.println("Queue size is: " + queue.size());
        System.out.println("Is queue empty: " + queue.isEmpty());
        queue.clear();
        System.out.println("---------------");

        CustomQueue<String> queue2 = new CustomQueue<>();
        queue2.push("Alla");
        queue2.push(" ma ");
        queue2.push(" kota.");
        System.out.println("Last element is: " + queue2.front());
        System.out.println("Queue size is: " + queue2.size());
        queue2.clear();
        System.out.println("Is queue empty: " + queue2.isEmpty());
        System.out.println("---------------");
    }

}
