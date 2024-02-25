package main;

import linkedlistqueue.LinkedListQueue;

public class Main {
    public static void main(String[] args) {
        LinkedListQueue linkedListQueue = new LinkedListQueue();
        linkedListQueue.enQueue(1);
        linkedListQueue.enQueue(2);
        linkedListQueue.enQueue(3);
        linkedListQueue.enQueue(4);
        linkedListQueue.peek();
        linkedListQueue.display();


    }
}
