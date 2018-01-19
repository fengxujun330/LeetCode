package cn.xj.code;

/**
 * 
 * Given a positive integer, output its complement number. The complement
 * strategy is to flip the bits of its binary representation.
 * 
 * Note: The given integer is guaranteed to fit within the range of a 32-bit
 * signed integer. You could assume no leading zero bit in the integer’s binary
 * representation. 
 * 
 * Example 1: Input: 5 
 * Output: 2 
 * Explanation: The binary representation of 5 is 101 (no leading zero bits), and its complement is 010. So you need to output 2. 
 * 
 * Example 2: Input: 1 
 * Output: 0 
 * Explanation: The binary representation of 1 is 1 (no leading zero bits),and its complement is 0. So you need to output 0.
 * 
 * @author alanfeng
 *
 */
public class NumberComplement {

    //me
    public static int findComplement(int num) {
        StringBuilder sb = new StringBuilder();
        for(char tmp:Integer.toBinaryString(num).toCharArray()){
            if('0' == tmp){
                sb.append('1');
            }else{
                sb.append('0');
            }
        }
        return Integer.parseInt(sb.toString(), 2);
    }

    /**
     * 最高位左移一位再减一，然后与上取反数。
     * @param num
     * @return
     */
    public int findComplement2(int num) {
        return ~num & ((Integer.highestOneBit(num) << 1) - 1);
    }
    
    public static void main(String[] args) {
//        System.out.println(findComplement(1));
        System.out.println(Integer.toBinaryString(~1));
    }
}
