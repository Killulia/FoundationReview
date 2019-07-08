package com.example.foundationreview.chain;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.example.foundationreview.R;
import com.example.geektime.chaintable.Node;

public class ChainActivity extends AppCompatActivity {
    public static final String TAG = "ccg";
    Node head = new Node(0);
    int length;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addNode(1);
        addNode(3);
        addNode(2);
        addNode(4);
//        addIndexNode(4,1);
//        addIndexNode(-1,0);
//        addIndexNode(-1,-2);
//        addIndexNode(-1,6);
//        deleteNode(0);
//        deleteNode(3);
        reverse();
        printNode();
        length = getLength();
//        Log.d(TAG, "length: "+length);

    }

    /**
     * 末尾插入节点
     * @param data
     */
    public void addNode(int data){
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
    public void addIndexNode(int data,int index){
        if (index>getLength() || index<0){
            Log.d(TAG, "输入位置不合法");
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
    public void deleteNode(int index){
        if (index>getLength()-1 || index<0){
            Log.d(TAG, "输入位置不合法");
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
    public void printNode(){
        if (head.next != null) {
            Node temp = head.next;
            while (temp!=null){
                Log.d(TAG, "printNode: "+temp.data);
                if (temp.next==null){
                    Log.d(TAG, "next null");
                }
                temp = temp.next;
            }
        }
    }

    /**
     * 获取链表长度
     */
    public int getLength(){
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
    public void reverse(){
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
