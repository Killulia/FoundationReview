package com.example.geektime;


import com.example.geektime.chaintable.MyLinkedList;
import com.example.geektime.chaintable.Node;
import com.example.geektime.proxy.ClassA;
import com.example.geektime.proxy.ClassAProxy;
import com.example.geektime.proxy.FuncInterface;
import com.example.geektime.recursion.Solution;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class Test {
    public static final String TAG = "ccg";
    static Node head = new Node(0);
    private int length;
    private static String reverse = "abcdefg";
    static int nodes[] = {1, 2, 3, 4, 5};
    public static void main(String[] args){
        Solution.reverseString(reverse.toCharArray());
        buildNodes(nodes);

    }

    public static void buildNodes(int[] args) {
        for (int node : nodes) {
            addNode(node);
        }
        deleteNode(1);
        printNode();
    }


    /**
     *     动态代理
     */
    private static void proxy() {
        ClassAProxy proxy = new ClassAProxy(new ClassA());
        FuncInterface funcInterface = proxy.getProxy();
        funcInterface.display();
        funcInterface.haha();
        //还可以这样
        FuncInterface funcInterface1 = (FuncInterface) Proxy.newProxyInstance(ClassA.class.getClassLoader(), new Class[]{FuncInterface.class}, new InvocationHandler() {
            @Override
            public Object invoke(Object o, Method method, Object[] objects) throws Throwable {
                System.out.println("1");
                Object result = method.invoke(new ClassA(),objects);
                System.out.println("2");
                return result;
            }
        });
        funcInterface1.display();
    }


    /**
     * 末尾插入节点
     * @param data
     */
    public static void addNode(int data){
        Node newNode = new Node(data);
        Node temp = head;
        while (temp.next != null){
            temp = temp.next;
        }
        temp.next = newNode;
    }

    /**
     * 根据索引插入节点
     */
    public static void addIndexNode(int data,int index){
        if (index>getLength() || index<0){
            System.out.println("输入位置不合法");
            return;
        }
        Node temp = head;

        int cIndex = 0;
        while (cIndex<index){
            cIndex++;
            temp = temp.next;
        }
        Node newNode = new Node(data);
        newNode.next = temp.next;
        temp.next = newNode;

    }

    /**
     * 根据索引删除节点
     */
    public static void deleteNode(int index){
        if (index>getLength()-1 || index<0){
            System.out.println("输入位置不合法");
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
    }

    /**
     * 遍历打印链表数据
     */
    public static void printNode(){
        if (head.next != null) {
            Node temp = head.next;
            while (temp!=null){
                System.out.println("printNode: "+temp.data);
                if (temp.next==null){
                    System.out.println("next null");
                }
                temp = temp.next;
            }
        }
    }

    /**
     * 获取链表长度
     */
    public static int getLength(){
        int length = 0;
        Node cNode = head;
        while (cNode.next!=null){
            length++;
            cNode = cNode.next;
        }
        return length;
    }

    /**
     * 反转链表
     */
    public static void reverse(){
        Node temp = head.next;
        Node current = temp.next;
        while (current!=null){
            temp.next = current.next;
            current.next = head.next;
            head.next = current;
            current = temp.next;
        }
    }
}
