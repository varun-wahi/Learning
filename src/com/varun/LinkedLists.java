package com.varun;

public class LinkedLists {
    public static void main(String[] args) {
//        * linked list has head and tail which leads to first
//          and last element
//        * Every node has a value and a pointer
//        * The disadavantage is that every node only knows the next
//          node to it

        CustomLinkedlList list = new CustomLinkedlList();
        list.insertFirst(21);
        list.insertFirst(42);
        list.insertFirst(63);
        list.insertLast(99);
        list.insertAtIndex(3, 1);
        list.printList();
        list.deleteLast();
        list.printList();
        list.deleteFromIndex(2);
        list.printList();
    }
}
