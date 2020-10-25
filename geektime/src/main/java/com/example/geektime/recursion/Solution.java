package com.example.geektime.recursion;

public class Solution {
    static int index;
    public static void reverseString(char[] s) {
        if (s==null || s.length==0){
            return;
        }

        index = s.length;
        display(s,index-1);

    }

    public static void display(char[] s,int index){
        char temp = s[index];
        s[index] = s[s.length - 1 - index];
        s[s.length-1-index] = temp;
        if (index==0){
            return;
        }
        display(s,index-1);
    }

}