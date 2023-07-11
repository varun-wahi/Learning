package com.varun;

public class CustomDoublyLinkedList {
    private Node head;
    private Node tail;
    private int size = 0;

    public void insertFirst(int val){
        Node node = new Node(val);
        if(size == 0){
            head = node;
            tail = head;
            node.next = null;
            node.prev = null;
            size++;
            return;
        }

        node.next = head;

        node.prev = null;
        if(head != null){head.prev = node;}
        head = node;
        size++;


    }

    public void insertLast(int val){
        Node node = new Node(val);
        if(tail != null){
            tail.next = node;//
        }else{
            insertFirst(val);
        }
        node.prev = tail;
        tail = node;
        size++;
    }

    public void printList(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.value + " -> ");
            temp  =temp.next;
        }
        System.out.print("End");
    }
    public void printListReverse(){
        System.out.println();
        Node temp = tail;
        while(temp != null){
            System.out.print(temp.value + " -> ");
            temp = temp.prev;
        }
        System.out.print("End.");
    }

    private class Node{
        private Node next;
        private Node prev;
        private int value;

        Node(int value){
            this.value = value;
        }
        Node(int value, Node next, Node prev){
            this.value = value;
            this.next = next;
            this.prev = prev;
        }

    }
}
