package com.study.ocp.leetcode_day01;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solution {

	public static void main(String[] args) {
		int nums[] = { 2, 3, 6, 4 };
		Solution solution = new Solution();
		int[] sum = solution.twoSum(nums, 7);
		System.out.println(Arrays.toString(sum));
	}

	public int[] twoSum(int nums[], int target) {

		int[] res = new int[2];
		if (nums == null) {
			return res;
		}

		Map<Integer, Integer> map = new HashMap<>();
		int key = 0;
		for (int i = 0; i <= nums.length; i++) {
			key = target - nums[i];
			if (map.containsKey(key)) {
				res[0] = map.get(key); // 5,0 // 4,1 // 1,2 // 3,3
				res[1] = i;
				break;
			} else {
				map.put(nums[i], i);
			}
		}
		return res;
	}

}
