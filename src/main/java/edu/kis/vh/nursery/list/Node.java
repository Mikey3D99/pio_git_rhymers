package edu.kis.vh.nursery.list;

/**
 * This class creates a node which is a part of IntLinkedList object
 */
public class Node {
  
    private int value;
    private Node prev;
    private Node next;

    public Node(int i) {
        setValue(i);
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Node getPrev() {
        return prev;
    }

    public void setPrev(Node prev) {
        this.prev = prev;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
