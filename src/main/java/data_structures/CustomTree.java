package data_structures;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class CustomTree<T> {

    private T element;
    private CustomTree<T> parent;
    private List<CustomTree<T>> children = new ArrayList<>();

    private CustomTree(T value) {
        this.element = value;
    }

    private CustomTree(T value, CustomTree<String> parent) {
        this.element = value;
        this.parent = (CustomTree<T>) parent;
    }

    private List<CustomTree<T>> getChildren() {
        return children;
    }

    private void setParent(CustomTree<T> parent) {
        parent.addChild((T) this);
        this.parent = parent;
    }

    private void addChild(T value) {
        CustomTree<T> child = new CustomTree<>(this.element);
        child.setParent(this);
        this.children.add(this);
    }

    private void addChild(CustomTree<T> child) {
        child.setParent(this);
        this.children.add(this);
    }

    private T getValue() {
        return this.element;
    }

    private boolean isRoot() {
        return (this.parent == null);
    }

    private boolean isLesf() {
        return (this.children == null);
    }

    private CustomTree<T> getParent() {
        return parent;
    }

    private void print(){

    }

    public static void main(String[] args) {

        CustomTree<Integer> tree = new CustomTree<>(2);

        CustomTree<String> parentNode = new CustomTree<>("Parent");
        CustomTree<String> childNode1 = new CustomTree<>("Parent", parentNode);
        CustomTree<String> childNode2 = new CustomTree<>("Parent");

    }


}
