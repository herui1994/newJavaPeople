package stack;

import java.util.ArrayList;

public class Stack<T> {
    private ArrayList<T> list;
    private int size; //stack top or length

    public Stack(int size) {
        this.size = 0;
        this.list = new ArrayList<T>(size);
    }

    public void push(T element){
        this.list.add(element);
        this.size++;
    }

    //pop top element
    public T pop(){
        if(this.size >0){
            T e = list.get(this.size-1);
            this.list.remove(this.size-1);
            this.size--;
            return e;
        }else {
            return null;
        }
    }

    public T getTop(){
        if(this.size > 0){
            T e = this.list.get(this.size-1);
            return e;
        }
        return  null;
    }
}
