package data_structures;

import java.util.LinkedList;

public class CustomQueue<T> {

    private LinkedList<T> elements = new LinkedList<>();

    public void push(T element) {
        elements.addLast(element);
    }

    public T pop() {
        return elements.removeLast();
    }

    public T front() {
        return elements.getLast();
    }

    public boolean isEmpty() {
        return elements.isEmpty();
    }

    public void clear() {
        while (!elements.isEmpty()) {
            T element = elements.pop();
            System.out.println(element);
        }
    }

    public int size() {
        return elements.size();
    }

    public static void main(String[] args) {
        CustomQueue<Integer> queue = new CustomQueue<>();

        queue.push(1);
        queue.push(2);
        queue.push(3);
        System.out.println("Last element is: " + queue.front());
        System.out.println("Stack size is: " + queue.size());
        System.out.println("Is stack empty: " + queue.isEmpty());
        queue.clear();
        System.out.println("---------------");

        CustomQueue<String> queue2 = new CustomQueue<>();
        queue2.push("Alla");
        queue2.push(" ma ");
        queue2.push(" kota.");
        System.out.println("Last element is: " + queue2.front());
        System.out.println("Stack size is: " + queue2.size());
        System.out.println("Is stack empty: " + queue2.isEmpty());
        queue2.clear();
        System.out.println("---------------");
    }

}
