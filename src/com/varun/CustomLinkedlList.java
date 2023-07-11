package com.varun;

public class CustomLinkedlList {

    private Node head;
    private Node tail;

    private int size;

    public CustomLinkedlList() {
        this.size = 0;
    }

    public void insertFirst(int val) {
        Node node = new Node(val);
        node.next = head;
        head = node; //new head will be the new node

        if (tail == null) {
            tail = head;
        }
        size++;
    }

    public void insertLast(int val) {
        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size++;

        if (tail == null) {
            insertFirst(val);
            return;
        }

    }

    public void insertAtIndex(int index, int val) {
        if (index == 0) {
            insertFirst(val);
            return;
        }
        if (index == size) {
            insertLast(val);
            return;
        } else {

            Node temp = head;
            for (int i = 1; i < index; i++) {
                temp = temp.next;
            }
            Node node = new Node(val, temp.next);
            temp.next = node; //value assigned

            size++;
        }
    }

    public void deleteFirst() {
        int val = head.value;
        head = head.next;
        size--;

        if (head == null) {
            tail = null;
        }
        System.out.println(val + " has been removed.");
    }

    public void deleteLast() {
        if (size <= 1) {
            deleteFirst();
        }

        int val = tail.value;
        Node secondLast = getNode(size - 2);
        secondLast.next = null;
        System.out.println(val + " has been removed.");
        size--;
    }

    public void deleteFromIndex(int index){
        if(index == 0){
            deleteFirst();
            return;
        }
        if(index == size){
            deleteLast();
            return;
        }
        else {
            Node nodeBefore = getNode(index-1);
            Node nodeAfter = getNode(index+1);
            int val = nodeBefore.next.value;

            nodeBefore.next = nodeAfter;
            size--;
            System.out.println(val+" has been removed from index "+index);
        }
    }

    public Node getNode(int index) {
        Node node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }

    public void printList() {
        System.out.println();
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("End");
    }

    public Node findNode(int val){
        Node node = head;
        while(node != null){
            if(node.value == val){
                return node;
            }
            node = node.next;
            }
        return null;
    }


    private class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }
}
