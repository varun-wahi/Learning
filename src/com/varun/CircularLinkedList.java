package com.varun;

public class CircularLinkedList {
    int size =0;
    Node head;
    Node tail;
    //no null until list is empty
    public CircularLinkedList(){
        this.head = null;
        this.tail = null;
    }

    public void insert(int value){
        Node node = new Node(value);
        if(head == null){
            //list empty
            head = node;
            tail = node;
            return;
        }

       tail.next = node;
       node.next = head;
       tail = node;
       size++;
    }

    public void display(){
        Node temp = head;
        if(head != null){
            do {
                System.out.println(temp.val + " -> ");
                temp = temp.next;
            }
            while(temp!= head);
        }


    }
    private class Node{
        Node next;
        int val;
        public Node(int value){
            this.val = value;
        }
    }
}
