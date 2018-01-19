package cn.xj.code;

/**
 * Given an array and a value, remove all instances of that value in-place and
 * return the new length.
 * 
 * Do not allocate extra space for another array, you must do this by modifying
 * the input array in-place with O(1) extra memory.
 * 
 * The order of elements can be changed. It doesn't matter what you leave beyond
 * the new length.
 * 
 * Example:
 * 
 * Given nums = [3,2,2,3], val = 3,
 * 
 * Your function should return length = 2, with the first two elements of nums
 * being 2.
 * 
 * @author alanfeng
 *
 */
public class RemoveElement {

    public static int removeElement(int[] nums, int val) {
        int len = nums.length;
        for (int i = 0; i < len; ) {
            if (nums[i] == val) {
                for (int j = i; j < nums.length; j++) {
                    if (j + 1 >= nums.length) {
                        break;
                    }
                    nums[j] = nums[j + 1];
                }
                len--;
            }else{
                i++;
            }
        }
        return len;
    }
    
    public static int removeElement2(int[] nums, int val) {
        int index = -1;
        for(int i=0;i<nums.length;i++){
            if(nums[i] != val){
                nums[++index] = nums[i];
            }
        }
        return index+1;
    }
    public static void main(String[] args) {
        System.out.println(removeElement2(new int[]{3,2,2,3}, 3));
    }
}
