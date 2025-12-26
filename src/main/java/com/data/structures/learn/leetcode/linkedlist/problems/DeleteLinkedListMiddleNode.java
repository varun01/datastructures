package com.data.structures.learn.leetcode.linkedlist.problems;

import com.data.structures.learn.leetcode.linkedlist.SingleLinkedListNode;
import com.data.structures.learn.leetcode.linkedlist.util.LinkedListUtil;

public class DeleteLinkedListMiddleNode {

    public static void main(String[] args) {
        SingleLinkedListNode listNode = LinkedListUtil.generateLinkedListInAscendingOrder(10, 1);
        LinkedListUtil.printLinkedList(listNode);
        deleteMiddleNode(listNode);
    }

    private static SingleLinkedListNode deleteMiddleNode(SingleLinkedListNode head) {
        SingleLinkedListNode ptr1 = head;
        SingleLinkedListNode ptr2 = head;
        while(ptr2 != null) {
            ptr1 = ptr1.getNext();
            ptr2 = ptr2.getNext().getNext();
        }
        LinkedListUtil.printLinkedList(ptr1);
        LinkedListUtil.printLinkedList(ptr2);
        return null;
    }
}
