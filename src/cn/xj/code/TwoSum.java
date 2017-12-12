package cn.xj.code;

/**
 * Two Sum 
 * Given an array of integers, return indices of the two numbers such
 * that they add up to a specific target.
 * 
 * You may assume that each input would have exactly one solution, and you may
 * not use the same element twice.
 * 
 * Example: Given nums = [2, 7, 11, 15], target = 9,
 * 
 * Because nums[0] + nums[1] = 2 + 7 = 9, return [0, 1].
 * 
 * @author alanfeng
 *
 */
public class TwoSum {

    public static int[] twoSum(int[] nums, int target) {
        int[] pos = new int[2];
        for(int i = 0; i < nums.length; i++){
            for(int j = i+1; j<nums.length;j++){
                if(nums[i] + nums[j] == target){
                    pos[0] = i;
                    pos[1] = j;
                    break;
                }
            }
        }
        return pos;
    }
    
    public static void main(String[] args) {
        int[] pos = twoSum(new int[]{2, 7, 11, 15}, 9);
        System.out.println("[" + pos[0]+ ","+ pos[1] +"]");
    }
}
