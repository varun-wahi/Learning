package com.varun;

import java.util.*;

public class StacksAndQueues {
    public static void main(String[] args) {
//        Stack<Integer> stack= new Stack<>(); //Follows LIFO
//        stack.push(23);
//        stack.push(56);
//        stack.push(67);
//        stack.push(98);
//
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());

//        Queue<Integer> queue = new LinkedList<>(); //Queues Follow FIFO
//        queue.add(67);
//        queue.add(28);
//        queue.add(89);
//        queue.add(56);
//        queue.add(45);
//
//        System.out.println(queue.peek()); //returns the head of the queue
//        System.out.println(queue.remove()); //remove by FIFO Principle;


        Deque<Integer> deque = new ArrayDeque<>(); //double ended queues
        //One can insert and remove elements from both sides
        // faster than stacks and linked lists
        //Mostly used in solving tree traversal problems (ex. BSF)
        deque.add(90);
        deque.addLast(85);
        deque.add(65);
        deque.addLast(69);

        deque.remove();
        deque.removeLast();



    }
}
