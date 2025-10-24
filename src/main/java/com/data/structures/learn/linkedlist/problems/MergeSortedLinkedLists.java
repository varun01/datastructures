package com.data.structures.learn.linkedlist.problems;

import com.data.structures.learn.linkedlist.SingleLinkedListNode;

public class MergeSortedLinkedLists {

    public static void main(String[] args) {
        SingleLinkedListNode listNode1 = new SingleLinkedListNode(1);
        listNode1.setNext(new SingleLinkedListNode(2));
        listNode1.getNext().setNext(new SingleLinkedListNode(4));

        SingleLinkedListNode listNode2 = new SingleLinkedListNode(1);
        listNode2.setNext(new SingleLinkedListNode(3));
        listNode2.getNext().setNext(new SingleLinkedListNode(4));

        System.out.println(mergeTwoLists(listNode1, listNode2));
    }

    private static SingleLinkedListNode mergeTwoLists(SingleLinkedListNode listNode1, SingleLinkedListNode listNode2) {
        SingleLinkedListNode result = new SingleLinkedListNode(0);
        SingleLinkedListNode current = result;
        while (listNode1 != null && listNode2 != null) {
            if(listNode1.getVal() < listNode2.getVal()) {
                current.setNext(listNode1);
                listNode1 = listNode1.getNext();
            } else {
                current.setNext(listNode2);
                listNode2 = listNode2.getNext();
            }
            current = current.getNext();
        }

        if(listNode1 != null)
            current.setNext(listNode1);
        else
            current.setNext(listNode2);
        return result;
    }

}
