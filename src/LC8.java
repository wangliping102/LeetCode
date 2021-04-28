import java.util.Scanner;

/**
 * @author wlp
 * @create 2021-04-16 16:21
 */
public class LC8 {
    public static void main(String[] args) {
        LC8 lc8 = new LC8();
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int res = lc8.myAtoi(s);
        System.out.println(res);
    }

    public int myAtoi(String s) {
        int len = s.length();
        char[] chs = s.toCharArray();
        int index=0;
        while(index < len && chs[index] == ' '){
            index++;
        }
        if(index == len){
            return 0;
        }
        int sign = 1;
        if(chs[index] == '+'){
            index++;
        }else if(chs[index] == '-'){
            sign = -1;
            index++;
        }
        int res = 0;
        while(index < len){
            char curChar = chs[index];
            if(curChar < '0' || curChar > '9'){
                break;
            }
            if(res > Integer.MAX_VALUE/10 || (res == Integer.MAX_VALUE/10 && (curChar-'0') > Integer.MAX_VALUE%10)){
                return Integer.MAX_VALUE;
            }
            if(res < Integer.MIN_VALUE/10 || (res == Integer.MIN_VALUE/10 && (curChar-'0') > -(Integer.MIN_VALUE%10))){
                return Integer.MIN_VALUE;
            }
            res = res * 10 + sign * (curChar - '0');
            index++;
        }
        return res;
    }
}
