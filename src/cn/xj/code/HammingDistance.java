package cn.xj.code;

/**
 * 
 * The Hamming distance between two integers is the number of positions at which
 * the corresponding bits are different.
 * 
 * Given two integers x and y, calculate the Hamming distance. Note: 0 ≤ x, y <
 * 231.
 * 
 * Example: Input: x = 1, y = 4 Output: 2
 * 
 * Explanation: 1 (0 0 0 1) 4 (0 1 0 0) ↑ ↑
 * 
 * The above arrows point to positions where the corresponding bits are
 * different.
 * 
 * @author alanfeng
 *
 */
public class HammingDistance {

    public static int hammingDistance(int x, int y) {
        String xB = Integer.toBinaryString(x);
        String yB = Integer.toBinaryString(y);

        int p1 = xB.length() - 1;
        int p2 = yB.length() - 1;
        int result = 0;
        while (p1 >= 0 || p2 >= 0) {
            char ch1 = '0';
            if (p1 >= 0) {
                ch1 = xB.charAt(p1);
            }

            char ch2 = '0';
            if (p2 >= 0) {
                ch2 = yB.charAt(p2);
            }
            if (ch1 != ch2) {
                result++;
            }
            p1--;
            p2--;
        }
        return result;
    }

    public static int hammingDistance2(int x, int y) {
        // return Integer.bitCount(x^y); //一行解决……
        int result = x ^ y;
        String tmp = Integer.toBinaryString(result);
        result = 0;
        for (char ch : tmp.toCharArray()) {
            if ('1' == ch) {
                result++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(hammingDistance2(1, 5));
    }
}
