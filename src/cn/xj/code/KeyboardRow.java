package cn.xj.code;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;

/**
 * 
 * Given a List of words, return the words that can be typed using letters of
 * alphabet on only one row's of American keyboard like the image below.
 * 
 * Example 1: Input: ["Hello", "Alaska", "Dad", "Peace"] 
 * Output: ["Alaska", "Dad"] 
 * Note: You may use one character in the keyboard more than once. 
 * You may assume the input string will only contain letters of alphabet.
 * 
 * @author alanfeng
 *
 */
public class KeyboardRow {

    private static final String FIRST_ROW="QWERTYUIOPqwertyuiop";
    private static final String SECOND_ROW="ASDFGHJKLasdfghjkl";
    private static final String THIRD_ROW="ZXCVBNMzxcvbnm";
    
    public static String[] findWords(String[] words) {
        ArrayList<String> list = new ArrayList<>();
        for(String tmp: words){
            char[] chars = tmp.toCharArray();
            boolean inFirst = true;
            boolean inSecond = true;
            boolean inThird = true;
            for(char ch: chars){
                if(-1 == FIRST_ROW.indexOf(ch)){
                    inFirst = false;
                }
                if(-1 == SECOND_ROW.indexOf(ch)){
                    inSecond = false;
                }
                if(-1 == THIRD_ROW.indexOf(ch)){
                    inThird = false;
                }
                if(!inFirst && !inSecond && !inThird){
                    break;
                }
            }
            if(inFirst || inSecond || inThird){
                list.add(tmp);
            }
        }
        return list.toArray(new String[list.size()]);
    }
    
    public static String[] findWords2(String[] words) {
        return Stream.of(words).filter(s->s.toLowerCase().matches("[qwertyuiop]*|[asdfghjkl]*|[zxcvbnm]*")).toArray(String[]::new);
    }
    
    public static void main(String[] args) {
        System.out.println(Arrays.toString(findWords2(new String[]{"Hello", "Alaska", "Dad", "Peace"})));
    }

}
