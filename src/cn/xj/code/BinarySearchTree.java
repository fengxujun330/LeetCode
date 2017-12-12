package cn.xj.code;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Find Mode in Binary Search Tree
 * 
 * Given a binary search tree (BST) with duplicates, find all the mode(s) (the
 * most frequently occurred element) in the given BST.
 * 
 * Assume a BST is defined as follows:
 * 
 * The left subtree of a node contains only nodes with keys less than or equal
 * to the node's key. The right subtree of a node contains only nodes with keys
 * greater than or equal to the node's key. Both the left and right subtrees
 * must also be binary search trees. For example: Given BST [1,null,2,2], 
 * 1
 *  \
 *   2
 *  /
 * 2 
 * return [2].
 * 
 * Note: If a tree has more than one mode, you can return them in any order.
 * 
 * Follow up: Could you do that without using any extra space? (Assume that the
 * implicit stack space incurred due to recursion does not count).
 * 
 * @author alanfeng
 *
 */
public class BinarySearchTree {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
    
    public int[] findMode(TreeNode root) {
        if(null == root){
            return new int[0];
        }

        HashMap<Integer, Integer> datas = new HashMap<Integer, Integer>();
        findMode(root, datas);
        ArrayList<Map.Entry<Integer, Integer>> modes = new ArrayList<Map.Entry<Integer, Integer>>();
        for(Map.Entry<Integer, Integer> entry: datas.entrySet()){
            int value = entry.getValue();
            if(0 == modes.size()){
                modes.add(entry);
            }else{
                int modeInArray = modes.get(0).getValue();
                if(modeInArray > value){
                    //do nothing
                }else if (modeInArray == value){
                    modes.add(entry);
                }else{
                    modes.clear();
                    modes.add(entry);
                }
            }
        }
        int[] result = new int[modes.size()];
        int i = 0;
        for(Map.Entry<Integer, Integer> entry: modes){
            result[i++] = entry.getKey();
        }
        return result;
    }
    private void findMode(TreeNode root, Map<Integer, Integer> datas){
        if(null == root){
            return;
        }
        Integer num = datas.get(root.val);
        if(null == num){
            datas.put(root.val, 1);
        }else {
            datas.put(root.val, num + 1);
        }
        findMode(root.left,datas);
        findMode(root.right, datas);
    }
}
