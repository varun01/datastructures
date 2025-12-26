package com.data.structures.learn.leetcode.linkedlist.problems;

import com.data.structures.learn.leetcode.linkedlist.SingleLinkedListNode;
import com.data.structures.learn.leetcode.linkedlist.util.LinkedListUtil;

public class RemoveNodeFromEndOfList {

    public static void main(String[] args) {
        SingleLinkedListNode listNode = new SingleLinkedListNode(1);
        listNode.setNext(new SingleLinkedListNode(2));
        listNode.getNext().setNext(new SingleLinkedListNode(3));
        listNode.getNext().getNext().setNext(new SingleLinkedListNode(4));
        listNode.getNext().getNext().getNext().setNext(new SingleLinkedListNode(5));
        LinkedListUtil.printLinkedList(listNode);
        LinkedListUtil.printLinkedList(removeNthFromEnd(listNode, 2));
    }

    public static SingleLinkedListNode removeNthFromEnd(SingleLinkedListNode listNode, int n) {
        SingleLinkedListNode dummy = new SingleLinkedListNode(0);
        dummy.setNext(listNode);

        SingleLinkedListNode sPtr = dummy;
        SingleLinkedListNode fPtr = listNode;
        for(int i = 1; i <= n; i++) {
            fPtr = fPtr.getNext();
        }

        while(fPtr != null) {
            fPtr = fPtr.getNext();
            sPtr = sPtr.getNext();
        }

        sPtr.setNext(sPtr.getNext().getNext());
        return dummy.getNext();
    }
}
