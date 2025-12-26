package com.data.structures.learn.leetcode.linkedlist.problems;

import com.data.structures.learn.leetcode.linkedlist.SingleLinkedListNode;
import com.data.structures.learn.leetcode.linkedlist.util.LinkedListUtil;

public class MiddleOfLinkedList {

    public static void main(String[] args) {
        SingleLinkedListNode listNode = LinkedListUtil.generateLinkedList(10);
        System.out.println(listNode);
        System.out.println("Middle of list: " + middleOfList(listNode));
    }

    private static int middleOfList(SingleLinkedListNode head) {
        SingleLinkedListNode sPtr = head;
        SingleLinkedListNode fPtr = head;
        while (sPtr != null && fPtr != null && fPtr.getNext() != null) {
            sPtr = sPtr.getNext();
            fPtr = fPtr.getNext().getNext();
        }
        return sPtr.getVal();
    }

}
