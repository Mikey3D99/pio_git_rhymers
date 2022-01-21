package edu.kis.vh.nursery.list;


// NOTE: te javadocsy nie maja wiekszego sensu poniewaz sam kod opisuje wszystko za siebiem, ale dodalem na potrzeby
// zadania
/**
 * This class represents a linked list object which includes Node objects as its elements
 */
public class IntLinkedList {

    private Node last;
    private int i;

    /**
     * @param i value of a node
     *          this method adds new node to the list
     */
    public void push(int i) {
        if (last == null)
            last = new Node(i);
        else {
            last.setNext(new Node(i));
            last.getNext().setPrev(last);
            last = last.getNext();
        }
    }

    /**
     * @return returns true if a list is empty
     */
    public boolean isEmpty() {
        return last == null;
    }

    /**
     * @return returns always false because this list cannot be full (? why is it here ?)
     */
    public boolean isFull() {
        return false;
    }

    /**
     * @return returns the last element of list
     */
    public int top() {
        if (isEmpty())
            return -1;
        return last.getValue();
    }

    /**
     * @return returns last value
     */
    public int pop() {
        if (isEmpty())
            return -1;
        int ret = last.getValue();
        last = last.getPrev();
        return ret;
    }

}
