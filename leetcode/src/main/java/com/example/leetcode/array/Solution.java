package com.example.leetcode.array;

import java.text.NumberFormat;

public class Solution {


    /*
    742中心索引
     */
    public static int pivotIndex(int[] nums) {
        //-1,-1,0,0,-1,-1    2
        //[-1,-1,-1,0,1,1]   0
        //1, 7, 3, 6, 5, 6   3
        int left = 0, right, sum = 0;
        int result = -1;
        for (int num : nums) {
            sum += num;
        }
        for (int i = 0; i < nums.length; i++) {
            if (i != 0) {
                left += nums[i - 1];
            }
            right = sum - left - nums[i];
            if (left == right) {
                result = i;
                break;
            }
        }
        return result;
    }

    /*
    747至少是其他数字两倍的最大数
     */
    public static int dominantIndex(int[] nums) {
        //0,1,0,0
        int max = 0, multiple,index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i==0){
                max = nums[i];
                index = i;
            }else {
                if (nums[i] >= max){
                    max = nums[i];
                    index = i;
                }
            }




        }

        nums[index] = 0;

        for (int num : nums) {
            multiple = num * 2;
            if (max < multiple) {
                index = -1;
                break;
            }
        }
        return index;
    }

    /*
    66加一
     */
    public static int[] plusOne(int[] digits) {
        //499
        int len = digits.length;
        for(int i = len - 1; i >= 0; i--) {
            digits[i]++;
            digits[i] %= 10;
            if(digits[i]!=0)
                return digits;
        }
        digits = new int[len + 1];
        digits[0] = 1;
        return digits;

    }
}
