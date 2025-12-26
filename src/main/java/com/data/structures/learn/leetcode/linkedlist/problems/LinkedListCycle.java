package com.data.structures.learn.leetcode.linkedlist.problems;

import com.data.structures.learn.leetcode.linkedlist.SingleLinkedListNode;
import com.data.structures.learn.leetcode.linkedlist.util.LinkedListUtil;

public class LinkedListCycle {

    public static void main(String[] args) {
        SingleLinkedListNode listNode = LinkedListUtil.generateLinkedList(4);
        SingleLinkedListNode join = new SingleLinkedListNode(5);
        listNode.getNext().getNext().getNext().setNext(join);
        listNode.getNext().getNext().getNext().getNext().setNext(new SingleLinkedListNode(6));
        listNode.getNext().getNext().getNext().getNext().getNext().setNext(new SingleLinkedListNode(7));
        listNode.getNext().getNext().getNext().getNext().getNext().getNext().setNext(new SingleLinkedListNode(8));
        listNode.getNext().getNext().getNext().getNext().getNext().getNext().getNext().setNext(new SingleLinkedListNode(9));
        listNode.getNext().getNext().getNext().getNext().getNext().getNext().getNext().getNext().setNext(new SingleLinkedListNode(10));
        listNode.getNext().getNext().getNext().getNext().getNext().getNext().getNext().getNext().getNext().setNext(join);
        System.out.println("LinkedList has cycle? " + hasCycle(listNode));
    }

    public static boolean hasCycle(SingleLinkedListNode head) {
        SingleLinkedListNode sPtr = head;
        SingleLinkedListNode fPtr = head;
        while(sPtr != null && fPtr != null && fPtr.getNext() != null) {
            sPtr = sPtr.getNext();
            fPtr = fPtr.getNext().getNext();

            System.out.println("slow pointer: " + sPtr);
            System.out.println("fast pointer: " + fPtr);
            if(sPtr == fPtr) {
                return true;
            }
        }
        return false;
    }
}
