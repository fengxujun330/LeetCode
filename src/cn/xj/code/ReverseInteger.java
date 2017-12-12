package cn.xj.code;

/**
 * 
 * 
 * Given a 32-bit signed integer, reverse digits of an integer.
 * 
 * Example 1: Input: 123 Output: 321
 * 
 * Example 2: Input: -123 Output: -321
 * 
 * Example 3: Input: 120 Output: 21
 * 
 * Note: Assume we are dealing with an environment which could only hold
 * integers within the 32-bit signed integer range. For the purpose of this
 * problem, assume that your function returns 0 when the reversed integer
 * overflows.
 * 
 * @author alanfeng
 *
 */
public class ReverseInteger {

    public static int reverse(int x) {
        long result = 0;
        while (x != 0) {
            result = result * 10 + x % 10;
            if (result > Integer.MAX_VALUE || result < Integer.MIN_VALUE) {
                return 0;
            }
            x = x / 10;
        }
        return (int) result;
    }

    public static void main(String[] args) {
        System.out.println(reverse(-321));
    }
}
