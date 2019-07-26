package dsa.reverse.integer.leetcode;

/**
 * 
 * @author cycorax12 https://leetcode.com/problems/reverse-integer/
 *
 */
public class ReverseIntegerLeetCode {
	public static void main(String[] args) {
		// int x = 1534236469;
		int x = 1534236469;
		System.out.println(new Solution().reverse(x));
	}
}

class Solution {
	public int reverse(int x) {
		int finalValue = 0;
		try {
			finalValue = Integer.valueOf(reverseInteger(Math.abs(x)));
		} catch (NumberFormatException ex) { // handle overflow

		}
		if (x < 0) {
			return finalValue * -1;
		}
		return finalValue;
	}

	private String reverseInteger(int x) {
		if (x % 10 == x) {
			return Integer.toString(x);
		}
		return Integer.toString(x % 10) + reverseInteger(x / 10);
	}

}
