package com.company;

public class ListNode {

    private ListNode nextNode = null;
    private int val;

    // Constructor
    public ListNode(int val) {
        this.val = val;
    }

    // Getters
    public int getVal() {
        return val;
    }

    public void addToTail(int newNodeVal) {
        ListNode tail = new ListNode(newNodeVal);
        ListNode current = this;

        while(current.nextNode != null){
            current = current.nextNode;
        }

        // Setting the tail to the last node in the linked list
        this.nextNode = tail;
    }

    public void addToHead(int newNodeVal) {
        ListNode head = new ListNode(newNodeVal);
        head.nextNode = this;
    }
}
