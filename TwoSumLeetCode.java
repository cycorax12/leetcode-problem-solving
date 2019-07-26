package dsa.two.sum.leetcode;

/**
 * https://leetcode.com/problems/two-sum/
 * 
 * @author cycorax12
 *
 */
public class TwoSumLeetCode {
	public static void main(String[] args) {
		//int[] nums = new int[] { 2, 7, 11, 15 };
		int[] nums = new int[] { 3, 2, 4 };
		int target = 6;
		System.out.println(new Solution().twoSum(nums, target));
	}
}

class Solution {
	public int[] twoSum(int[] nums, int target) {
		for (int i = 0; i < nums.length - 1; i++) {
			for (int j = i + 1; j <= nums.length - 1; j++) {
				if (nums[i] + nums[j] == target) {
					return new int[] { i, j };
				}
			}
		}
		return null;
	}
}
