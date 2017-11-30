package dequeue.action;

import dequeue.queue.Deque;

public class DequeueAction {
    public static void main(String[] args){
        Deque deque = new Deque();
        for(int i = 0; i < 10; i++){
            deque.insertLast(i);
        }
//        deque.insertLast(11);
//        System.out.println(deque.getLength());
//        System.out.println(deque.removeFirst());
//        System.out.println(deque.getLength());
//        deque.insertLast(11);
//        deque.display();
        System.out.println(deque.removeFirst());
        System.out.println(deque.removeFirst());
        System.out.println(deque.removeFirst());
        System.out.println(deque.removeFirst());
        System.out.println(deque.removeFirst());
        System.out.println(deque.removeFirst());
        System.out.println(deque.removeFirst());
        System.out.println(deque.removeFirst());
        System.out.println(deque.removeFirst());
        System.out.println(deque.removeFirst());

        deque.insertLast(1);
        System.out.println(deque.removeFirst());
    }
}
