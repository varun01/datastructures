package com.data.structures.learn.leetcode.linkedlist.problems;

import com.data.structures.learn.leetcode.linkedlist.SingleLinkedListNode;
import com.data.structures.learn.leetcode.linkedlist.util.LinkedListUtil;

/*
 * You are given two non-empty linked lists representing two non-negative integers.
 * The digits are stored in reverse order, and each of their nodes contains a single digit. Add the two numbers and return the sum as a linked list.
 * You may assume the two numbers do not contain any leading zero, except the number 0 itself.
 */
public class AddTwoNumbers {

    public static void main(String[] args) {
        SingleLinkedListNode l1 = new SingleLinkedListNode(9);
        LinkedListUtil.printLinkedList(l1);

        SingleLinkedListNode l2 = new SingleLinkedListNode(1);
        l2.setNext(new SingleLinkedListNode(9));
        l2.getNext().setNext(new SingleLinkedListNode(9));
        l2.getNext().getNext().setNext(new SingleLinkedListNode(9));
        l2.getNext().getNext().getNext().setNext(new SingleLinkedListNode(9));
        l2.getNext().getNext().getNext().getNext().setNext(new SingleLinkedListNode(9));
        l2.getNext().getNext().getNext().getNext().getNext().setNext(new SingleLinkedListNode(9));
        l2.getNext().getNext().getNext().getNext().getNext().getNext().setNext(new SingleLinkedListNode(9));
        l2.getNext().getNext().getNext().getNext().getNext().getNext().getNext().setNext(new SingleLinkedListNode(9));
        l2.getNext().getNext().getNext().getNext().getNext().getNext().getNext().getNext().setNext(new SingleLinkedListNode(9));
        LinkedListUtil.printLinkedList(l2);

        LinkedListUtil.printLinkedList(addTwoNumbers(l1, l2));
    }

    public static SingleLinkedListNode addTwoNumbers(SingleLinkedListNode l1, SingleLinkedListNode l2) {
        int result;
        boolean greaterThanTen = false;
        SingleLinkedListNode listNode = new SingleLinkedListNode(0);
        SingleLinkedListNode current = listNode;
        while(l1 != null || l2 != null || greaterThanTen) {
            int l1Val = l1 != null ? l1.getVal() : 0;
            int l2Val = l2 != null ? l2.getVal(): 0;
            result = l1Val + l2Val + (greaterThanTen ? 1 : 0);
            greaterThanTen = result >= 10;
            current.setNext(new SingleLinkedListNode(result%10));
            current = current.getNext();
            l1 = l1 != null ? l1.getNext() : null;
            l2 = l2 != null ? l2.getNext() : null;
        }
        return listNode.getNext();
    }

}
