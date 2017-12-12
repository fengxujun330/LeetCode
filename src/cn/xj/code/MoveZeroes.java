package cn.xj.code;

/**
 * Move Zeroes 
 * 
 * Given an array nums, write a function to move all 0's to the end
 * of it while maintaining the relative order of the non-zero elements.
 * 
 * For example, given nums = [0, 1, 0, 3, 12], after calling your function, nums
 * should be [1, 3, 12, 0, 0].
 * 
 * Note: You must do this in-place without making a copy of the array. Minimize
 * the total number of operations.
 * 
 * @author alanfeng
 *
 */
public class MoveZeroes {

    public void moveZeroes(int[] nums) {
        if(null == nums || 1 >= nums.length){
            return;
        }
        int lenght = nums.length;
        for(int i=0; i<lenght-1; i++){
            while((i< lenght -1) && nums[i] != 0){
                i++;
            }
            int j = i+1;
            while((j<lenght-1) && (nums[j]==0)){
                j++;
            }
            if(j >= lenght){
                break;
            }
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }
    }
    
    public void moveZeroes2(int[] nums) {
        if (nums == null || nums.length <= 1) return;        

        int insertPos = 0;
        for (int num: nums) {
            if (num != 0) nums[insertPos++] = num;
        }        

        while (insertPos < nums.length) {
            nums[insertPos++] = 0;
        }
    }
    
    public void moveZeroes3(int[] nums) {
        if(null == nums || 1 >= nums.length){
            return;
        }
        int lenght = nums.length;
        int[] result = new int[lenght];
        int j = 0;
        for(int i=0; i<=lenght-1; i++){
            if(nums[i] != 0){
                result[j++] = nums[i];
            }
        }
        for(int i=0; i<=lenght-1; i++){
            nums[i] = result[i];
        }
    }
}
