import java.util.*;

/**
 * @author wlp
 * @create 2021-04-18 20:35
 */
public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int[] res = new int[k];
        int[] times = new int[k];
        for(int i = 0;i < n;i++){
            times[i] = scanner.nextInt();
        }

        int[][] array = new int[n][k];
        for(int i = 0;i < n;i++){
            for(int j = 0;j < k;j++){
                array[i][j] = times[i] * (j+1);
            }
        }

        Queue<Integer> queue = new PriorityQueue<>(k);

        for(int i = 0;i < n;i++){
            for(int j = 0;j < k;j++){
                queue.add(array[i][j]);
            }

        }


        for(int num:res){
            System.out.println(num);
        }



    }

}
