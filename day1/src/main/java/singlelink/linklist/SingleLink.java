package singlelink.linklist;

import singlelink.module.Node;

public class SingleLink {
    public int size;
    private Node first;
    private Node last;

    public SingleLink(){
        size = 0;
        this.first = null;
        this.last = null;
    }

    public boolean insertLast(int data){
        if(this.first == null){
            first = new Node(data);
        }else {
            Node node = new Node(data);
            last.setNext(node);
            last = node;
        }
        size++;
        return true;
    }

    public boolean insertFirst(int data){
        if(first == null){
            first = new Node(data);
            last = first;
        }else {
            Node node = new Node(data);
            node.setNext(first);
            first = node;
        }
        size++;
        return true;
    }

    public boolean insertByIndex(int index, int data){
        if(index > (size + 1) || index < 1 ){
            return false;
        }else if(index == 1){
            insertFirst(data);
        }else {
            Node node = new Node(data);
            Node tmp = first;
            for(int i = 1; i < index - 1; i++ ){
                tmp = tmp.getNext();
            }
            node.setNext(tmp.getNext());
            tmp.setNext(node);
        }
        size++;
        return  true;
    }

    public boolean deleteByIndex(int index){
        if(index > size || index <= 0){
            return false;
        }else if(index == 1){
            Node node = first.getNext();
            first = node;
        }
        else {
            Node tmp = first;
            for(int i = 1; i <= index - 2; i++){
                tmp = tmp.getNext();
            }
            tmp.setNext(tmp.getNext().getNext());
        }
        size--;
        return true;
    }

    public boolean queryData(int data){
        Node temp = first;
        int index = 1;
        while (temp != null){
            if(temp.getData() == data){
                System.out.println("found data and it index is: " + index);
                return true;
            }
            index++;
            temp = temp.getNext();
        }
        return false;
    }
    
    public void display(){
        Node node = first;
        System.out.println("first -> last :");
        while (node != null){
            System.out.print(node.getData() + "->");
            node = node.getNext();
        }
    }

}
