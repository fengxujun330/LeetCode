package cn.xj.code;

import java.util.Arrays;

/**
 * 
 * There are two sorted arrays nums1 and nums2 of size m and n respectively.
 * 
 * Find the median of the two sorted arrays. The overall run time complexity
 * should be O(log (m+n)).
 * 
 * Example 1: nums1 = [1, 3] nums2 = [2]
 * 
 * The median is 2.0 
 * 
 * Example 2: nums1 = [1, 2] nums2 = [3, 4]
 * 
 * The median is (2 + 3)/2 = 2.5
 * 
 * @author alanfeng
 *
 */
public class MedianofTwoSortedArrays {
    /**
     * 不生成新的数组，用pre和current记录数据，用来计算平均值。
     * 把两数组看成逻辑上一个数组。
     * @param nums1
     * @param nums2
     * @return
     */
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if(null == nums1 || 0 == nums1.length){
            return nums2.length % 2 == 0? (nums2[nums2.length/2-1] + nums2[nums2.length/2])/2.0d :nums2[(nums2.length + 1)/2 -1] * 1.0d;
        }
        if(null == nums2 || 0 == nums2.length){
            return nums1.length % 2 == 0? (nums1[nums1.length/2-1] + nums1[nums1.length/2])/2.0d :nums1[(nums1.length + 1)/2 -1] * 1.0d;
        }
        int p1 = 0;
        int p2 = 0;
        int middle = (nums1.length + nums2.length) % 2 == 0? (nums1.length + nums2.length)/2:(nums1.length + nums2.length + 1)/2;
        int pre = 0;
        int current = 0;
        int index=0;
        while(index <= middle){
            index++;
            pre = current;
            if(p1 >= nums1.length){
                current = nums2[p2++];
                continue;
            }
            if(p2 >= nums2.length){
                current = nums1[p1++];
                continue;
            }
            if(nums1[p1] <= nums2[p2]){
                current=nums1[p1++];
            }else{
                current=nums2[p2++];
            }
        }
        System.out.println(pre + "::" + current);
        if((nums1.length + nums2.length) % 2 == 0){
            return (current + pre) /2.0d;
        }else{
            return pre;
        }
    }
    
    public static double findMedianSortedArrays2(int[] nums1, int[] nums2) {
        if(null == nums1 || 0 == nums1.length){
            return nums2.length % 2 == 0? (nums2[nums2.length/2-1] + nums2[nums2.length/2])/2.0d :nums2[(nums2.length + 1)/2 -1] * 1.0d;
        }
        if(null == nums2 || 0 == nums2.length){
            return nums1.length % 2 == 0? (nums1[nums1.length/2-1] + nums1[nums1.length/2])/2.0d :nums1[(nums1.length + 1)/2 -1] * 1.0d;
        }
        int[] newArray = new int[nums1.length + nums2.length];
        int p1 = 0;
        int p2 = 0;
        int index = 0;
        while(index < newArray.length){
            if(p1 >= nums1.length){
                newArray[index++] = nums2[p2++];
                continue;
            }
            
            if(p2 >= nums2.length){
                newArray[index++] = nums1[p1++];
                continue;
            }
            if(nums1[p1] < nums2[p2]){
                newArray[index++] = nums1[p1++];
            }else{
                newArray[index++] = nums2[p2++];
            }
        }
        System.out.println(Arrays.toString(newArray));
        return newArray.length % 2 == 0? (newArray[newArray.length/2-1] + newArray[newArray.length/2])/2.0d :newArray[(newArray.length + 1)/2 -1] * 1.0d;
    }
    public static void main(String[] args) {
        System.out.println(findMedianSortedArrays(new int[]{1, 2}, new int[]{3,4}));
        System.out.println(findMedianSortedArrays(new int[]{1, 3}, new int[]{2}));
        System.out.println(findMedianSortedArrays(new int[]{1}, new int[]{1}));
    }
}
