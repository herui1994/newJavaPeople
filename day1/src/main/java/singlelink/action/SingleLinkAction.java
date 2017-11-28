package singlelink.action;

import singlelink.linklist.SingleLink;

public class SingleLinkAction {
    public static void main(String[] args){
        SingleLink singleLink = new SingleLink();
        singleLink.insertFirst(2);
        singleLink.insertFirst(1);
        singleLink.insertLast(3);
        singleLink.insertByIndex(2,4);
        singleLink.insertLast(5);
        singleLink.display();
        System.out.println();

        //delete
        singleLink.deleteByIndex(2);
        singleLink.deleteByIndex(1);
        singleLink.display();
        System.out.println();
        if(!singleLink.queryData(36)){
            System.out.println("Not found data!");
        }
    }
}
