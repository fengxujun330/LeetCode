package com.xj.leetcode;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * Given a string, find the length of the longest substring without repeating characters.
 * Examples:
 * Given "abcabcbb", the answer is "abc", which the length is 3.
 * Given "bbbbb", the answer is "b", with the length of 1.
 * Given "pwwkew", the answer is "wke", with the length of 3. Note that the answer must be a substring, "pwke" is a subsequence and not a substring.
 * 
 * https://leetcode.com/problems/longest-substring-without-repeating-characters/?tab=Description
 * @author ajun
 *
 */
public class LongestSubstring {


	public static int lengthOfLongestSubstring(String s) {
        if(null == s) throw new IllegalArgumentException();
        if(1 == s.length())return 1;
        ArrayList<Character> currentSub = new ArrayList<Character>();
        int max = 0;
        int len = s.length();
        for(int i=0; i<len; i++){
        	char tmp = s.charAt(i);
        	if(currentSub.contains(tmp)){
        		if(currentSub.size() > max){
        			max = currentSub.size();
        		}
        		for(int j=0; j<currentSub.size();){
        			char aC = currentSub.get(j);
        			currentSub.remove((Character)aC);
        			if(aC == tmp){
        				break;
        			}
        		}
        		currentSub.add(tmp);
        	}else{
        		currentSub.add(tmp);
        	}
        }
        return currentSub.size() > max ? currentSub.size() : max;
    }
	
	public static void main(String[] args) {
		System.out.println(lengthOfLongestSubstring("pwwkew"));
	}
}
