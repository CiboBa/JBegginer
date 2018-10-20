package data_structures;

import java.util.LinkedList;

public class CustomStack<T> {

    private LinkedList<T> elements = new LinkedList<>();

    public void push(T element) {
        elements.addFirst(element);
    }

    public T pop() {
        return elements.removeFirst();
    }

    public T peek() {
        return elements.getFirst();
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
        CustomStack<Integer> stack = new CustomStack<>();
        stack.push(1);
        stack.push(3);
        stack.push(4);
        System.out.println("Last element is: " + stack.peek());
        System.out.println("Stack size is: " + stack.size());
        System.out.println("Is stack empty: " + stack.isEmpty());
        stack.clear();
        System.out.println("---------------");

        CustomStack<String> stack2 = new CustomStack<>();
        stack2.push("Alla");
        stack2.push(" ma ");
        stack2.push(" kota.");
        System.out.println("Last element is: " + stack2.peek());
        System.out.println("Stack size is: " + stack2.size());
        System.out.println("Is stack empty: " + stack2.isEmpty());
        stack2.clear();
        System.out.println("---------------");
    }

}
