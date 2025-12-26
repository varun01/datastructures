package com.data.structures.learn.leetcode.linkedlist.problems;

class DesignCircularLinkedList {

    private static class ListNode {

        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
            this.next = null;
        }

    }

    int size;
    int capacity;
    ListNode left;
    ListNode right;

    public DesignCircularLinkedList(int k) {
        this.size = 0;
        this.capacity = k;
        this.left = null;
        this.right = null;
    }

    public boolean enQueue(int value) {
        if (isFull()) {
            return false;
        }
        ListNode curr = new ListNode(value);
        if (this.left == null) {
            this.left = curr;
            this.right = this.left;
        } else {
            this.right.next = curr;
            this.right = curr;
        }
        this.size++;
        return true;
    }

    public boolean deQueue() {
        if (isEmpty()) {
            return false;
        }
        this.left = this.left.next;
        this.size--;
        return true;
    }

    public int front() {
        return isEmpty() ? -1 : this.left.val;
    }

    public int rear() {
        return isFull() ? -1 : this.right.val;
    }

    public boolean isEmpty() {
        return this.size == 0;
    }

    public boolean isFull() {
        return this.size == this.capacity;
    }

    public static void main(String[] args) {
        DesignCircularLinkedList circularLinkedList = new DesignCircularLinkedList(3);
        boolean param_1 = circularLinkedList.enQueue(1);
        boolean param_12 = circularLinkedList.enQueue(2);
        boolean param_13 = circularLinkedList.enQueue(3);
        boolean param_14 = circularLinkedList.enQueue(4);
        boolean param_2 = circularLinkedList.deQueue();
        int param_3 = circularLinkedList.front();
        int param_4 = circularLinkedList.rear();
        boolean param_5 = circularLinkedList.isEmpty();
        boolean param_6 = circularLinkedList.isFull();
    }

}

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */
