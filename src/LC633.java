/**
 * @author wlp
 * @create 2021-04-28 14:38
 */

/*
    平方数之和
    给定一个非负整数 c ，你要判断是否存在两个整数 a 和 b，使得 a^2 + b^2 = c 。
 */
public class LC633 {

    public static void main(String[] args) {
        LC633 solve = new LC633();
        System.out.println(solve.judgeSquareSum(5));
    }

    public boolean judgeSquareSum(int c){
        long left = 0;
        long right = (long) Math.sqrt(c);
        while(left<=right){
            long sum = left*left + right*right;
            if(c == sum){
                return true;
            }
            if(c > sum){
                left++;
            }
            if(c < sum){
                right--;
            }
        }
        return false;

    }
}
