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

    public MyLinkedList(Node node){
        head = new Node(0);
        head.next = node;
        getLength();
    }

    /**
     * 获取链表长度
     */
    public int getLength() {
        int length = 0;
        Node cNode = head;
        while (cNode.next != null) {
            length++;
            size++;
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
        if (index > size){
            return;
        }
        Node temp = head;
        int cur = 0;
        while (cur < index){
            cur ++;
            temp = temp.next;
        }
        Node node = new Node(val);
        node.next = temp.next;
        temp.next = node;
        size ++ ;

    }

    /**
     * Delete the index-th node in the linked list, if the index is valid.
     */
    public void deleteAtIndex(int index) {
      if (index >= size || index < 0){
          return;
      }
      Node temp = head;
        int cur = 0;
        while (cur < index){
            cur ++;
            temp = temp.next;
        }
        Node p = temp.next;
        temp.next = p.next;
        p = null;
        size--;

    }
    /*
    141 是否有环
     */
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

    /*
    142 环形链表 II 找到入环的第一个节点
     */
    public Node detectCycle(Node head) {
        if (head != null) {
            Node slow, fast;
            slow = head;
            fast = head;
            while (true) {
                if ((fast== null || fast.next == null)){
                    return null;
                }
                slow = slow.next;
                fast = fast.next.next;

                if (slow == fast) {
                    break;
                }

            }
            fast = head;
            while (fast != slow) {
                slow = slow.next;
                fast = fast.next;
            }
            return fast;
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

//        if (headA!=null && headB!=null){
//            if (headA != null && headB != null) {
//                int step, lenA, lenB = 0;
//                lenA = getLength(headA);
//                lenB = getLength(headB);
//                step = lenA - lenB;
//                if (step > 0) {
//                    for (int i = 0; i < Math.abs(step); i++) {
//                        headA = headA.next;
//                    }
//                } else if (step < 0) {
//                    for (int i = 0; i < Math.abs(step); i++) {
//                        headB = headB.next;
//                    }
//                }
//                while (headA != null && headB != null) {
//                    if (headA == headB) {
//                        return headA;
//                    }
//                    headA = headA.next;
//                    headB = headB.next;
//                }
//            }
//        }
//        return null;
        //消除长度差算法
        if (headA == null || headB == null) return null;
        Node pA = headA, pB = headB;
        while (pA != pB) {
            pA = pA.next == null ? headB : pA.next;
            pB = pA.next == null ? headA : pB.next;
        }
        return pA;

    }

    /**
     * 19 删除倒数第N个节点，并返回头结点
     *
     * @param head
     * @param n
     * @return
     */
    public Node removeNthFromEnd(Node head, int n) {
        //暴力算法
//        Node dummy = new Node(0);
//        dummy.next = head;
////        int length = 0;
//        Node first = head;
//        while (first != null) {
//            length++;
//            first = first.next;
//        }
//        length -= n;
//        first = dummy;
//        while (length > 0) {
//            length--;
//            first = first.next;
//        }
//        first.next = first.next.next;
//        return dummy.next;

        //快慢指针
        Node pre = new Node(0);
        pre.next = head;
        Node start = pre, end = pre;
        while(n != 0) {
            start = start.next;
            n--;
        }
        while(start.next != null) {
            start = start.next;
            end = end.next;
        }
        end.next = end.next.next;
        return pre.next;





    }





}
