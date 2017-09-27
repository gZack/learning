package com.zkassa.learning.dataStructure.linkedList;

public class LinkedList<T> {

    public Node head;

    public int size;

    public LinkedList(){
        head = null;
    }

    private class Node {
        private T value;
        private Node next;

        public Node(T value){
            this.value = value;
        }
    }

    public void addAtBegin(T x){
        Node currentHead = new Node(x);
        currentHead.next = this.head;
        this.head = currentHead;
        size++;
    }

    public T deleteAtBegin(){
        T deletedValue = head != null ? this.head.value : null;
        this.head = this.head.next;
        --size;
        return deletedValue;
    }

    public T deleteAtEnd(){
        T deletedValue = null;
        if(head != null && head.next == null){
            deletedValue = head.value;
            head = null;
        } else {
            Node current = head;
            while (current.next.next != null){

                current = current.next;
            }
            deletedValue = current.next.value;
            current.next = null;
            size--;
        }
        return deletedValue;
    }

    public void addAtEnd(T x){
        if(head == null){
            addAtBegin(x);
        } else {
            Node next = new Node(x);
            Node current = head;
            while (current.next != null){
                current = current.next;
            }
            current.next = next;
            size++;
        }
    }


}
