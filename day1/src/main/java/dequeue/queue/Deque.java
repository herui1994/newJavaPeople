package dequeue.queue;

public class Deque {
    private int[] data;
    private int head;
    private int tail;
    private int length;
    private final static int DEFAULT_SIZE = 10;

    public int getLength() {
        return length;
    }
    public Deque(){
        data = new int[DEFAULT_SIZE];
        head = 0;
        tail = 0;
        length = 0;
    }

    public Deque(int size){
        if(size > 0){
            data = new int[size];
        }else {
            data = new int[DEFAULT_SIZE];
        }
        head = 0;
        tail = 0;
        length = 0;
    }

    public boolean isFull(){
        if(length == data.length){
            return true;
        }else {
            return false;
        }
    }

    public boolean isEmpty(){
        if(length == 0){
            return true;
        }else {
            return false;
        }
    }

    public boolean insertLast(int element){
        if(!isFull()){
            data[tail] = element;
            length++;
            if(!isFull() && tail <= data.length - 2 && (tail + 1 != head)){
                tail++;
            }else if(!isFull() && tail == data.length - 1 && head != 0){
                tail = 0;
            }else if(isFull()){
                tail = head;
            }
            return true;
        }else {
            System.out.println("The queue is full!");
            return false;
        }
    }

    public int removeFirst(){
        if(!isEmpty() && head < data.length - 1){
            head++;
            length--;
            return data[head-1];
        }else if(!isEmpty() && head == data.length - 1){
            head = 0;
            length--;
            return data[data.length - 1];
        }else {
            head = tail;
            System.out.println("The queue is empty!");
            return 0;
        }
    }
}
