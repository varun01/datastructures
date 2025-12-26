package com.data.structures.learn.leetcode.linkedlist.problems;

import com.data.structures.learn.leetcode.linkedlist.SingleLinkedListNode;
import com.data.structures.learn.leetcode.linkedlist.util.LinkedListUtil;

public class RemoveLinkedListElements {

    public static void main(String[] args) {
//        int[] arr = {6,1,2,3,6,4,5,6,7};
        int[] arr = {1,6,6,6,6,6,6,6,6};
        SingleLinkedListNode node = LinkedListUtil.generateLinkedListFromArray(arr, arr.length);
        System.out.println(removeLinkedListElements(node, 6));
    }

    private static SingleLinkedListNode removeLinkedListElements(SingleLinkedListNode listNode, int numberToRemove) {
        SingleLinkedListNode temp = new SingleLinkedListNode(1);
        temp.setNext(listNode);
        SingleLinkedListNode curr = temp;
        while(curr.getNext() != null) {
            if(curr.getNext().getVal() == numberToRemove) {
                curr.setNext(curr.getNext().getNext());
            } else {
                curr = curr.getNext();
            }
        }
        return temp.getNext();
    }
}
