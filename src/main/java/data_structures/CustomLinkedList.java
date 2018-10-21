package data_structures;

public class CustomLinkedList<T> {

    private CustomLinkedList<T> next;
    private CustomLinkedList<T> prev;
    private T value;
    private int size;

    private CustomLinkedList(T value) {
        this.value = value;
        next = prev = null;
        size = 0;
    }

    private void add(CustomLinkedList<T> newElement) {
        CustomLinkedList last = this;
        while (last.next != null) {
            last = last.next;
        }
        last.next = newElement;
        newElement.prev = last;
        size++;
    }

    private void add(CustomLinkedList<T> newElement, int index) {
        CustomLinkedList last = this;
        int listIndex = 0;
        while (last.next != null) {
            if (listIndex == index + 1) {
                break;
            }
            last = last.next;
            listIndex++;
        }
        newElement.prev = last;
        newElement.next = last.next;
        last.next = newElement;
        last.next.prev = newElement;
        size++;
    }

    private CustomLinkedList<T> remove(CustomLinkedList<T> element) {
        size--;
        if (this.value == element.value) {
            return this.next;
        }
        CustomLinkedList toRemove = this.next;
        while (toRemove != null) {
            if (toRemove.value == element.value) {
                toRemove.prev.next = toRemove.next;
                if (toRemove.next != null) {
                    toRemove.next.prev = toRemove.prev;
                    return this;
                }
            }
            toRemove = toRemove.next;
        }
        return this;
    }

    private CustomLinkedList<T> get(int index) {
        CustomLinkedList temp = this;
        int listIndex = 0;
        while (temp != null) {
            if (listIndex == index) {
                return temp;
            }
            temp = temp.next;
            listIndex++;
        }
        return null;
    }

    private int size() {
        return size;
    }

    private boolean isEmpty() {
        return size == 0;
    }

    private void print() {
        CustomLinkedList temp = this;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        CustomLinkedList<Integer> head = new CustomLinkedList<>(1);

        head.add(new CustomLinkedList<>(2));
        head.add(new CustomLinkedList<>(3));
        head.add(new CustomLinkedList<>(4));
        head.add(new CustomLinkedList<>(5),2);


        //head = head.remove(new CustomLinkedList<>(2));
        head.print();
        System.out.println(head.isEmpty());
        System.out.println(head.size());

    }
}
