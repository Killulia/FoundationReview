package com.example.leetcode.hot100;

import java.util.HashMap;

public class Solution {

    /*
    1. 两数之和 {2,7,11,15}
     */
    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey( target - nums[i])){
                return new int[]{map.get(target - nums[i]), i};
            }
            map.put(nums[i],i);
        }

        throw new IllegalArgumentException("No two solution");
    }

}
