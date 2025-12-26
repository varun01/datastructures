package com.data.structures.learn.leetcode.linkedlist.util;

import java.util.StringJoiner;

import com.data.structures.learn.leetcode.linkedlist.SingleLinkedListNode;

public class LinkedListUtil {

    private LinkedListUtil(){
    }

    public static SingleLinkedListNode generateLinkedList(int nodeCount) {
        SingleLinkedListNode node = new SingleLinkedListNode(nodeCount);
        if(nodeCount > 1) {
            nodeCount--;
            node.setNext(generateLinkedList(nodeCount));
        }
        return node;
    }

    public static SingleLinkedListNode generateLinkedListInAscendingOrder(int nodeCount, int counter) {
        var node = new SingleLinkedListNode(counter);
        if(counter < nodeCount) {
            counter++;
            node.setNext(generateLinkedListInAscendingOrder(nodeCount, counter));
        }
        return node;
    }

    public static SingleLinkedListNode generateLinkedListFromArray(int[] elements, int length) {
        SingleLinkedListNode listNode = new SingleLinkedListNode(elements[elements.length - length]);
        if(length > 1) {
            length--;
            listNode.setNext(generateLinkedListFromArray(elements, length));
        }
        return listNode;
    }

    public static void printLinkedList(SingleLinkedListNode node) {
        StringJoiner joiner = new StringJoiner("->");
        while(node != null) {
            joiner.add(String.valueOf(node.getVal()));
            node = node.getNext();
        }
        System.out.println(joiner);
    }
}
