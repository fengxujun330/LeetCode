package cn.xj.code;

/**
 * Find the contiguous subarray within an array (containing at least one number)
 * which has the largest sum.
 * 
 * For example, given the array [-2,1,-3,4,-1,2,1,-5,4], the contiguous subarray
 * [4,-1,2,1] has the largest sum = 6.
 * 
 * @author alanfeng
 *
 */
public class MaximumSubarray {

    public static int maxSubArray(int[] nums) {
        if(null == nums || 0 == nums.length){
            throw new RuntimeException();
        }
        int max = nums[0];
        int start = 0;
        int end = start;
        int sum = 0;
        for(int i = 0; i< nums.length;i++){
            sum = 0;
            for(int j=i; j< nums.length;j++){
                sum += nums[j];
                if(sum > max){
                    max = sum;
                    start = i;
                    end = j;
                }
            }
        }
        System.out.println("start:" + start + " end:" + end);
        return max;
    }
    
    /**
     * discuss answer
     * @param nums
     * @return
     */
    public static int maxSubArray2(int[] nums) {
        int max = Integer.MIN_VALUE, sum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (sum < 0) {
                sum = nums[i];
            } else {
                sum += nums[i];
            }
            if (sum > max) {
                max = sum;
            }
        }
        return max;
    }
    
    public static void main(String[] args) {
        System.out.println(maxSubArray(new int[]{-2,1,-3,4,-1,2,1,-5,4}));
        System.out.println(maxSubArray(new int[]{-2,1}));
    }
}
