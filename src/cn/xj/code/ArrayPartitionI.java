package cn.xj.code;

import java.util.Arrays;

/**
 * Given an array of 2n integers, your task is to group these integers into n
 * pairs of integer, say (a1, b1), (a2, b2), ..., (an, bn) which makes sum of
 * min(ai, bi) for all i from 1 to n as large as possible.
 * 
 * Example 1: Input: [1,4,3,2]
 * 
 * Output: 4 
 * Explanation: n is 2, and the maximum sum of pairs is 4 = min(1, 2)
 * + min(3, 4). 
 * 
 * Note: n is a positive integer, which is in the range of [1,10000]. 
 * All the integers in the array will be in the range of [-10000,10000].
 * 
 * @author alanfeng
 *
 */
public class ArrayPartitionI {
    
    /**
     * 求分组后每对数据的最小值之和的最大值。也就是让最小值尽可能大。
     * 或者换句话说：让每组的最小值尽可能大。第二大的数据跟最大数一组变可达到需要。
     * 排序后就是隔位取数。
     * 
     * @param nums
     * @return
     */
    public int arrayPairSum(int[] nums) {
         Arrays.sort(nums);
         int sum = 0;
         for(int i=0; i<nums.length;i=i+2){
             sum += nums[i];
         }
         return sum;
    }
}
