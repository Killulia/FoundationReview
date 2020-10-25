package com.example.geektime.chaintable;

public class MyLinkedList {
    public Node head;
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


    public int getLength(Node head) {
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
    public void printNode() {
        if (head.next != null) {
            Node temp = head.next;
            while (temp != null) {
                System.out.print(temp.data + ",");
                temp = temp.next;
            }
        }
    }

    /**
     * Get the value of the index-th node in the linked list. If the index is invalid, return -1.
     */
    public int get(int index) {

        if (index < 0 || index >= size) {
            return -1;
        }
        Node temp = head.next;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }

        return temp.data;

    }

    /**
     * Get the value of the index-th node in the linked list. If the index is invalid, return -1.
     */
    public Node getNode(int index) {

        if (index < 0 || index >= size) {
            return null;
        }
        Node temp = head.next;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }

        return temp;

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
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = node;
        size++;
    }

    /**
     * Add a node of value val before the index-th node in the linked list. If index equals to the length of linked list, the node will be appended to the end of linked list. If index is greater than the length, the node will not be inserted.
     */
    public void addAtIndex(int index, int val) {
        if (index > size) {
            return;
        }
        Node temp = head;
        for (int i = 0; i < index; i++) {
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
        if (index >= size || index < 0) {
            return;
        }
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        Node q = temp.next;
        temp.next = q.next;
        q = null;
        size--;
    }

    public boolean hasCycle(Node head) {
        if (head != null) {
            Node slow = head, fast = head;
            while (fast.next != null && fast.next.next != null) {
                slow = slow.next;
                fast = fast.next.next;

                if (slow == fast)
                    return true;
            }
        }
        return false;

    }

    public Node detectCycle(Node head) {
        if (head != null) {
            int step = 0;
            Node slow = head, fast = head;
            while (fast.next != null && fast.next.next != null) {
                slow = slow.next;
                fast = fast.next.next;

                if (slow == fast)
                    return getNode(size - step);
            }
        }
        return null;

    }

    /**
     * 求第一个相交节点
     *
     * @param headA
     * @param headB
     * @return
     */
    public Node getIntersectionNode(Node headA, Node headB) {
        if (headA != null && headB != null) {
            int step, lenA, lenB = 0;
            lenA = getLength(headA);
            lenB = getLength(headB);
            step = lenA - lenB;
            if (step > 0) {
                for (int i = 0; i < Math.abs(step); i++) {
                    headA = headA.next;
                }
            } else if (step < 0) {
                for (int i = 0; i < Math.abs(step); i++) {
                    headB = headB.next;
                }
            }
            while (headA != null && headB != null) {
                if (headA == headB) {
                    return headA;
                }
                headA = headA.next;
                headB = headB.next;
            }
        }

        return null;

    }

    /**
     * 删除倒数第N个节点，并返回头结点
     *
     * @param head
     * @param n
     * @return
     */
    public Node removeNthFromEnd(Node head, int n) {
        Node dummy = new Node(0);
        dummy.next = head;
        int length  = 0;
        Node first = head;
        while (first != null) {
            length++;
            first = first.next;
        }
        length -= n;
        first = dummy;
        while (length > 0) {
            length--;
            first = first.next;
        }
        first.next = first.next.next;
        return dummy.next;


    }
}
