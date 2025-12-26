package com.data.structures.learn.leetcode.linkedlist;

public class SingleLinkedListNode {
    int val;
    SingleLinkedListNode next;

    public SingleLinkedListNode(int x) {
        val = x;
        next = null;
    }

    public SingleLinkedListNode getNext() {
        return next;
    }

    public void setNext(SingleLinkedListNode next) {
        this.next = next;
    }

    public int getVal() {
        return val;
    }

    @Override
    public String toString() {
        return "ListNode{" +
                "val=" + val +
                ", next=" + next +
                '}';
    }

}
