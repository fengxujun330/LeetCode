package cn.xj.code;

/**
 * 
 * 
Given a non-negative integer num, repeatedly add all its digits until the result has only one digit.

For example:

Given num = 38, the process is like: 3 + 8 = 11, 1 + 1 = 2. Since 2 has only one digit, return it.

Follow up:
Could you do it without any loop/recursion in O(1) runtime?

Credits:
Special thanks to @jianchao.li.fighter for adding this problem and creating all test cases.
 * @author alanfeng
 *
 */
public class AddDigits {

    public static int addDigits(int num) {
        // return num==0?0:(num%9==0?9:(num%9)); //最优解
        char[] arr = String.valueOf(num).toCharArray();
        int sum = 0;
        do{
            for(char tmp: arr){
                sum += Character.digit(tmp, 10);
            }
            if(sum < 10){
                break;
            }
            arr = String.valueOf(sum).toCharArray();
            sum = 0;
        }while(true);
        
        return sum;
    }
    
    public static void main(String[] args) {
        System.out.println(addDigits(11));
    }
}
