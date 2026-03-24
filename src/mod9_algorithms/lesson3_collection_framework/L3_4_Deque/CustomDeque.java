package mod9_algorithms.lesson3_collection_framework.L3_4_Deque;

import mod9_algorithms.lesson3_collection_framework.L3_3_Queue.CustomQueue;

import java.util.NoSuchElementException;

public class CustomDeque<E> extends CustomQueue<E> implements IDeque<E>{

    private Node<E> head;
    private Node<E> tail;
    private static class Node<E> {
        E element;
        Node<E> next;
        Node<E> prev;

        public Node(E element) {
            this.element = element;
        }
    }

    public CustomDeque() {
        super();
        head = null;
        tail = null;
    }

    @Override
    public void addFirst(E element) {
        //O(1)
        Node<E> newNode = new Node(element);
        if (head == null) head = tail = newNode;
        else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }

    @Override
    public void addLast(E element) {
        //O(1)
        Node<E> newNode = new Node(element);
        if (tail == null) head = tail = newNode;
        else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        size++;
    }

    @Override
    public E removeFirst() {
        //O(1)
        if (head == null) throw new NoSuchElementException();
        E element = head.element;
        head = head.next;
        if (head == null) {
            tail = null;
        } else {
            head.prev = null;
        }
        size--;
        return element;
    }

    @Override
    public E removeLast() {
        //O(1)
        if (head == null) throw new NoSuchElementException();
        E element = head.element;
        tail = tail.prev;
        if (tail == null) {
            head = null;
        } else {
            tail.next = null;
        }
        size--;
        return element;
    }

    @Override
    public E peekFirst() {
        if (head == null) return null;
        return head.element;
    }

    @Override
    public E peekLast() {
        if (tail == null) return null;
        return tail.element;
    }
}
