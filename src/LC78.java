import java.util.*;

/**
 * @author wlp
 * @create 2021-04-16 14:10
 */
public class LC78 {
    public static void main(String[] args) {
        LC78 m = new LC78();
        List<List<Integer>> res = m.subsets(new int[]{1,2,3});
//        for(List<Integer> list : res){
//            for(int num : list){
//                System.out.print(num + " ");
//            }
//            System.out.println();
//        }
        res.forEach(System.out::println);
    }
    public List<List<Integer>> subsets(int[] nums){
        List<List<Integer>> res = new ArrayList<>();
        res.add(new ArrayList<>());
        for(int num:nums){
            List<List<Integer>> newRes = new ArrayList<>();
            for(List<Integer> list : res){
                List<Integer> newlist = new ArrayList<>(list);
                newlist.add(num);
                newRes.add(newlist);
            }
            res.addAll(newRes);
        }
        return res;


    }


}
