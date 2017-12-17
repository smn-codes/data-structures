package com.smn.codes.ds.linkedlist;

public class Node<T extends Comparable<T>> {

    private final T data;
    private Node<T> next;

    public Node(final T data) {
        this.data = data;
        setNext(null);
    }

    public Node<T> getNext() {
        return next;
    }

    public T getData() {
        return data;
    }

    public void setNext(final Node<T> next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return String.valueOf(data);
    }

}
