package com.data.structures.learn.leetcode.linkedlist.problems;

import com.data.structures.learn.leetcode.linkedlist.SingleLinkedListNode;
import com.data.structures.learn.leetcode.linkedlist.util.LinkedListUtil;

/*
* Given the head of a singly linked list and two integers left and right where left <= right,
* reverse the nodes of the list from position left to position right, and return the reversed list.
* */
public class ReverseLinkedList2 {

    public static void main(String[] args) {
        SingleLinkedListNode list = new SingleLinkedListNode(1);
        list.setNext(new SingleLinkedListNode(2));
        list.getNext().setNext(new SingleLinkedListNode(3));
        list.getNext().getNext().setNext(new SingleLinkedListNode(4));
        list.getNext().getNext().getNext().setNext(new SingleLinkedListNode(5));
        list.getNext().getNext().getNext().getNext().setNext(new SingleLinkedListNode(6));
        LinkedListUtil.printLinkedList(list);

        LinkedListUtil.printLinkedList(reverseBetween(list, 2, 4));
    }

    public static SingleLinkedListNode reverseBetween(SingleLinkedListNode head, int left, int right) {
        SingleLinkedListNode result = null;
        SingleLinkedListNode swapPtr = null;
        int i = 1;
        SingleLinkedListNode leftList = new SingleLinkedListNode(0);
        SingleLinkedListNode leftListPtr = leftList;
        SingleLinkedListNode rightList = new SingleLinkedListNode(0);
        SingleLinkedListNode rightListPtr = rightList;
        while(head != null) {
            if(i < left) {
                leftListPtr.setNext(new SingleLinkedListNode(head.getVal()));
                leftListPtr = leftListPtr.getNext();
            } else if (i <= right) {
                SingleLinkedListNode ln = new SingleLinkedListNode(head.getVal());
                ln.setNext(result);
                result = ln;
                if(swapPtr == null)
                    swapPtr = ln;
            } else {
                rightListPtr.setNext(new SingleLinkedListNode(head.getVal()));
                rightListPtr = rightListPtr.getNext();
            }
            i++;
            head = head.getNext();
        }
        swapPtr.setNext(rightList.getNext());
        leftListPtr.setNext(result);
        return leftList.getNext();
    }
}
