package com.example.geektime.chaintable;

public class MyLinkedList {
    Node head;
    int size = 0;

    /**
     * Initialize your data structure here.
     */
    public MyLinkedList() {
        head = new Node(0);
    }

    /**
     * 获取链表长度
     */
    public int getLength() {
        int length = 0;
        Node cNode = head;
        while (cNode.next != null) {
            length++;
            cNode = cNode.next;
        }
        return length;
    }

    /**
     * 打印链表
     */
    public  void printNode(){
        if (head.next != null) {
            Node temp = head.next;
            while (temp!=null){
                System.out.println("printNode: "+temp.data);
                temp = temp.next;
            }
        }
    }

    /**
     * Get the value of the index-th node in the linked list. If the index is invalid, return -1.
     */
    public int get(int index) {


        if (index<0 || index>size-1) {
            return -1;
        }
        int check = 0;
        Node temp = head.next;

        while (check < index) {
            temp = temp.next;
            check++;
        }


        return temp.data;

    }

    /**
     * Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list.
     */
    public void addAtHead(int val) {
        Node node = new Node(val);
        node.next = head.next;
        head.next = node;
        size++;
    }

    /**
     * Append a node of value val to the last element of the linked list.
     */
    public void addAtTail(int val) {
        Node node = new Node(val);
        Node temp = head;
        while (temp.next!=null){
            temp = temp.next;
        }
        temp.next = node;
        size++;
    }

    /**
     * Add a node of value val before the index-th node in the linked list. If index equals to the length of linked list, the node will be appended to the end of linked list. If index is greater than the length, the node will not be inserted.
     */
    public void addAtIndex(int index, int val) {
        if (index>getLength()){
            return;
        }
        Node temp = head;

        int cIndex = 0;
        while (cIndex<index){
            cIndex++;
            temp = temp.next;
        }
        Node newNode = new Node(val);
        newNode.next = temp.next;
        temp.next = newNode;
        size++;
    }

    /**
     * Delete the index-th node in the linked list, if the index is valid.
     */
    public void deleteAtIndex(int index) {
        if (index>getLength()-1 || index<0){
            return;
        }
        Node temp = head;

        int cIndex = 0;
        while (cIndex<index){
            cIndex++;
            temp = temp.next;
        }
        Node q = temp.next;
        temp.next = q.next;
        q = null;
        size--;
    }
}
