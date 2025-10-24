package com.data.structures.learn.linkedlist.problems;

import com.data.structures.learn.linkedlist.SingleLinkedListNode;
import com.data.structures.learn.linkedlist.util.LinkedListUtil;

public class ReverseLinkedList {

    public static void main(String[] args) {
        SingleLinkedListNode listNode = new SingleLinkedListNode(1);
        listNode.setNext(new SingleLinkedListNode(2));
        listNode.getNext().setNext(new SingleLinkedListNode(3));
        listNode.getNext().getNext().setNext(new SingleLinkedListNode(4));
        listNode.getNext().getNext().getNext().setNext(new SingleLinkedListNode(5));
        LinkedListUtil.printLinkedList(listNode);
        SingleLinkedListNode result = reverseList(listNode);
        LinkedListUtil.printLinkedList(result);
    }

    private static SingleLinkedListNode reverseList(SingleLinkedListNode head) {
        SingleLinkedListNode result = null;
        while (head != null) {
            SingleLinkedListNode listNode = new SingleLinkedListNode(head.getVal());
            listNode.setNext(result);
            result = listNode;
            head = head.getNext();
        }
        return result;
    }
}
