package com.smn.codes.ds.linkedlist;

public class LinkedList<T extends Comparable<T>> implements Cloneable {

    private Node<T> head = null;

    public LinkedList() {
        //Empty
    }

    public void add(T element) {
        Node<T> newNode = new Node<>(element);
        if (head == null) {
            head = newNode;
        }
        else {
            Node<T> currentNode = head;
            while (currentNode.getNext() != null) {
                currentNode = currentNode.getNext();
            }
            currentNode.setNext(newNode);
        }
    }

    public T get(int index) {
        int count = 0;
        Node<T> h = head;
        while (h != null) {
            if (count == index) {
                return h.getData();
            }
            h = h.getNext();
            count++;
        }

        throw new IndexOutOfBoundsException();
    }

    public int size() {
        if (head == null) {
            return 0;
        }
        else {
            Node<T> currentNode = head;
            int count = 0;
            while (currentNode != null) {
                count++;
                currentNode = currentNode.getNext();
            }
            return count;
        }

    }

    public T delete(int index) {
        if (index == 0) {
            if (head != null) {
                Node<T> tmpNode = head;
                head = head.getNext();
                return tmpNode.getData();
            }
        }
        else {
            int count = 1;
            Node<T> currentNode = head;
            while (currentNode != null) {
                Node<T> nextNode = currentNode.getNext();
                if (count == index) {
                    if (nextNode == null) {
                        break;
                    }
                    currentNode.setNext(nextNode.getNext());
                    return nextNode.getData();
                }
                currentNode = nextNode;
                count++;
            }
        }

        throw new IndexOutOfBoundsException();
    }

}
