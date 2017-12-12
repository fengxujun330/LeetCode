package cn.xj.code;

/**
 * Write a function that takes a string as input and returns the string
 * reversed.
 * 
 * Example: Given s = "hello", return "olleh".
 * 
 * @author alanfeng
 *
 */
public class ReverseString {

    public String reverseString(String s) {
        if (null == s || s.length() <= 1) {
            return s;
        }
        char[] arr = s.toCharArray();
        for (int i = 0, j = arr.length - 1; i < arr.length && j >= i; i++, j--) {
            char temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        return String.valueOf(arr);
    }
}
