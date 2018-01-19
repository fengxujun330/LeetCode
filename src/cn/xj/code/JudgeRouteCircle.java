package cn.xj.code;

/**
 * 
 * Initially, there is a Robot at position (0, 0). Given a sequence of its
 * moves, judge if this robot makes a circle, which means it moves back to the
 * original place.
 * 
 * The move sequence is represented by a string. And each move is represent by a
 * character. The valid robot moves are R (Right), L (Left), U (Up) and D
 * (down). The output should be true or false representing whether the robot
 * makes a circle.
 * 
 * Example 1: Input: "UD" Output: true 
 * Example 2: Input: "LL" Output: false
 * 
 * @author alanfeng
 *
 */
public class JudgeRouteCircle {
    public static boolean judgeCircle(String moves) {
        int xSum = 0;
        int ySum = 0;
        char[] chars = moves.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            switch (chars[i]) {
            case 'U':
            case 'u':
                ySum += 1;
                break;
            case 'L':
            case 'l':
                xSum -= 1;
                break;
            case 'R':
            case 'r':
                xSum += 1;
                break;
            case 'D':
            case 'd':
                ySum -= 1;
                break;
            default:
                break;
            }
        }
        if (0 == xSum && 0 == ySum) {
            return true;
        } else {
            return false;
        }
    }
    
    public static void main(String[] args) {
        System.out.println(judgeCircle("UD"));
    }
}
