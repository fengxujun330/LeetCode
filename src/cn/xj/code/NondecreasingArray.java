package cn.xj.code;

/**
 * Given an array with n integers, your task is to check if it could become
 * non-decreasing by modifying at most 1 element.
 * 
 * We define an array is non-decreasing if array[i] <= array[i + 1] holds for
 * every i (1 <= i < n).
 * 
 * Example 1: Input: [4,2,3] Output: True 
 * Explanation: You could modify the first 4 to 1 to get a non-decreasing array.
 * 
 * Example 2: Input: [4,2,1] Output: False 
 * Explanation: You can't get a non-decreasing array by modify at most one element.
 * 
 * Note: The n belongs to [1, 10,000].
 * 
 * @author alanfeng
 *
 */
public class NondecreasingArray {
    
    public static boolean checkPossibility(int[] nums) { //TODO:fix me
        if (null == nums || 1 >= nums.length) {
            return true;
        }
        int flag = -1;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] > nums[j]) {
                    if (flag == -1) {
                        flag = j;
                    } else if (flag != j) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
    
    public static void main(String[] args) {
        System.out.println(checkPossibility(new int[]{2,3,3,2,4}));
        System.out.println(checkPossibility(new int[]{4,2,3}));
        System.out.println(checkPossibility(new int[]{3,4,2,3}));
    }
}
