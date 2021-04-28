import javax.sound.midi.Soundbank;

/**
 * @author wlp
 * @create 2021-04-16 13:22
 */
public class LC62 {
    public static void main(String[] args) {
        LC62 m = new LC62();
        System.out.println(m.uniquePaths(3,7));
    }
    public int uniquePaths(int m,int n){
        //当i>0&&j>0时dp[i][j] = dp[i-1][j] + dp[i][j-1]
//        dp[0][j] = dp[i][0] = 1
        int[][] dp = new int[m][n];
        for(int i=0;i<m;i++){
            dp[i][0] = 1;
        }
        for(int j=0;j<n;j++){
            dp[0][j] = 1;
        }
        for(int i=1;i<m;i++){
            for(int j=1;j<n;j++){
                dp[i][j] = dp[i-1][j] +dp[i][j-1];
            }
        }
        return dp[m-1][n-1];
    }
}
