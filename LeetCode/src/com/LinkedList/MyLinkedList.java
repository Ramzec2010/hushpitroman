package com.LinkedList;

class MyLinkedList {
    private Node head;
    //private Node tail;
    private int length;


    public MyLinkedList() {
        head = null;
        length = 0;
        }


    public int get(int index) {
        Node curr = this.head;
        if(head == null || index >= this.length) {
            return -1;
        }
        else {
            if (index == 0) {return head.val;} else {
            for (int i = 0; i < index; i++){
                curr = curr.next;
            }
            }
        }
        return curr.val;
    }

    public void addAtHead(int val) {
        Node curr = new Node(val);
        curr.next = this.head;
        this.head = curr;
        this.length++;
    }


    public void addAtTail(int val) {
        Node last = this.head;
        Node curr = new Node(val);
        while (last.next != null ) {
            last = last.next;
        }
        last.next = curr;
        this.length++;
    }


    public void addAtIndex(int index, int val) {
        if (head == null || index >= this.length) return;
        if (index == this.length) {
            addAtTail(val);
            return;
        }
        if (index == 0) {
            addAtHead(val);
            return;
        }
        int i = 0;
        Node curr = this.head;
        while(i < index - 1) {
            i++;
            curr = curr.next;
        }
        Node prev = curr;
        Node next = curr.next;
        Node newNode = new Node(val);
        newNode.next = next;
        prev.next = newNode;
        this.length++;
    }

    public void deleteAtIndex(int index) {
        if (head == null || index >= length || index < 0) return;
        if (index == length - 1){
            Node last = this.head;
            for (int i = 0; i < length - 1; i++){
                last = last.next;
            }
            last.next = null;
            length--;
            return;
        }
        Node curr = this.head;
        for (int i = 1; i < index -1; i++) {
            curr = curr.next;
        }
        Node curr_1 = curr.next;
        curr_1 = curr_1.next;
        curr.next = curr_1;
        this.length--;
    }
    public int getSize() {
        return this.length;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    class Node {
        int val;
        Node next;
        Node(int x) { val = x; }

    }

    public static void main(String[] args) {
        MyLinkedList linkedList = new MyLinkedList();
//        int j = linkedList.get(0);
//        linkedList.addAtIndex(1,2);
//        linkedList.deleteAtIndex(0);
//        linkedList.addAtHead(1);
//        linkedList.addAtTail(3);
//        linkedList.addAtIndex(1,2);
//        int i  =  linkedList.get(1);
//        System.out.println(i);
//        linkedList.deleteAtIndex(1);
//        i = linkedList.get(1);
//        System.out.println(i);
        linkedList.addAtHead(1);
        int k = linkedList.get(0);
        linkedList.addAtIndex(0,2);
        k = linkedList.get(1);
        k = linkedList.get(0);
        k = linkedList.get(2);
//        linkedList.deleteAtIndex(1);

    }
}
