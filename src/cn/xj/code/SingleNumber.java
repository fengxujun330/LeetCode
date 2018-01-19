package cn.xj.code;

import java.util.HashSet;

/**
 * 
 * Given an array of integers, every element appears twice except for one. Find
 * that single one.
 * 
 * Note: Your algorithm should have a linear runtime complexity. Could you
 * implement it without using extra memory?
 * 
 * 
 * 
 * @author alanfeng
 *
 */
public class SingleNumber {

    public static int singleNumber(int[] nums) {
        HashSet<Integer> number = new HashSet<>();
        for(int tmp: nums){
            if(number.contains(tmp)){
                number.remove(tmp);
            }else{
                number.add(tmp);
            }
        }
        return (int) number.toArray()[0];
    }
    
    public static int singleNumber2(int[] nums) {
        int result = 0;
        for(int tmp:nums){
            result ^= tmp;
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println(singleNumber2(new int[]{1,2,3,4,5,6,7,1,2,3,4,5,6}));
    }
}
