package doublelink.linklist;

import doublelink.module.Node;
import java.util.Comparator;

public class DoubleLink<T> {
    private int size;
    private Node<T> first;
    private Node<T> last;
    public DoubleLink(){
        this.size = 0;
        this.first = null;
        this.last = null;
    }

    public int getSize() {
        return size;
    }

    public boolean insertFirst(T data){
        if(first == null){
            first = new Node<T>(data);
            last = first;
        }else {
            Node<T> temp = new Node<T>(data);
            temp.setRight(first);
            first.setLeft(temp);
            first = temp;
        }
        size++;
        return true;
    }

    public boolean insertLast(T data){
        if(first == null){
            first = new Node<T>(data);
            last = first;
        }else {
            Node<T> node = new Node<T>(data);
            node.setLeft(last);
            last.setRight(node);
            last = node;
        }
        size++;
        return true;
    }

    public T queryData(int index){
        if(index < 1 || index >size){
            System.out.println("You input index invalid!");
            return null;
        }
        else if(index == 1){
            return first.getData();
        }else {
            Node<T> temp = first;
            for(int i = 1; i <= index - 1; i++){
                temp = temp.getRight();
            }
            return temp.getData();
        }
    }

    public void display(){
        Node<T> node = first;
        while (node != null){
            System.out.print(node.getData().toString() + "->");
            node = node.getRight();
        }
    }

    public boolean remove(Object o) {
        if (o == null) {
            for (Node<T> x = first; x != null; x = x.getRight()) {
                if (x.getData() == null) {
                    unlink(x);
                    return true;
                }
            }
        } else {
            for (Node<T> x = first; x != null; x = x.getRight()) {
                if (o.equals(x.getData())) {
                    unlink(x);
                    return true;
                }
            }
        }
        return false;
    }

    public boolean removeFirst(){
        if(size > 0){
            unlink(first);
            return true;
        }else {
            return false;
        }
    }

    public boolean removeLast(){
        if(size > 0){
            unlink(last);
            return true;
        }else {
            return false;
        }
    }

    T unlink(Node<T> x) {
        final T element = x.getData();
        final Node<T> right = x.getRight();
        final Node<T> left = x.getLeft();

        if (left == null) {
            first = right;
        } else {
            left.setRight(right);
            x.setLeft(null);
        }

        if (right == null) {
            last = left;
        } else {
            right.setLeft(left);
            x.setRight(null);
        }

        x.setData(null);
        size--;
        return element;
    }

    public T removeByComparator(T data,Comparator<T> comparator){
        if(comparator == null){
            return null;
        }else {
            for (Node<T> x = first; x != null; x = x.getRight()) {
                if (comparator.compare(data, x.getData()) == 0) {
                    return unlink(x);
                }
            }
        }
        return null;
    }
}
