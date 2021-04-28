/**
 * @author wlp
 * @create 2021-04-18 19:33
 */

public class Main {
    static class ListNode{
        int val;
        ListNode next;
        ListNode(){}
        ListNode(int val){
            this.val = val;
        }
        ListNode(int val, ListNode next){
            this.val = val;
            this.next = next;
        }
    }
    public ListNode solve (ListNode S) {
        int len = 0;
        ListNode node = S;

        while(node != null){

            node = node.next;

            len++;
        }
        ListNode pre,last;
        pre = last = S;
        while (last.next!=null){
            pre = last;
            last = last.next;
        }


        ListNode[] nodes = new ListNode[len];
        return node;

    }
}
