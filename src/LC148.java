import java.util.List;

/**
 * @author wlp
 * @create 2021-04-18 12:05
 */

public class LC148 {
    static class ListNode{
        int val;
        ListNode next;
        ListNode(){}
        ListNode(int val){
            this.val = val;
        }
        ListNode(int val,ListNode next){
            this.val = val;
            this.next = next;
        }
    }
    public static void main(String[] args) {

    }
    public  ListNode sortList(ListNode node){
        if(node == null || node.next == null){
            return node;
        }
        ListNode head = node;
        int len = 0;
        while(node!=null){
            node = node.next;
            len++;
        }
        ListNode newHead = new ListNode(0,head);
        for(int subLen = 1;subLen < len;subLen <<= 1){
            ListNode pre = newHead;
            ListNode cur = newHead.next;
            while(cur!=null){
                ListNode head1 = cur;
                for(int i = 1;i < subLen&&cur.next!=null;i++){
                    cur = cur.next;
                }
                ListNode head2 = cur.next;
                cur.next = null;
                cur = head2;
                for(int i = 1;i < subLen&&cur!=null&&cur.next!=null;i++){
                    cur = cur.next;
                }
                ListNode next = null;
                if(cur!=null){
                    next = cur.next;
                    cur.next = null;
                }
                ListNode merge = mergeList(head1, head2);
                pre.next = merge;
                while(pre.next!=null){
                    pre = pre.next;
                }
                cur = next;

            }
        }
        return newHead.next;

    }
    public  ListNode mergeList(ListNode h1,ListNode h2){
        ListNode nHead = new ListNode(0,h1);
        ListNode pre1 = nHead;
        ListNode cur1 = h1;
        ListNode pre2,cur2;
        pre2 = cur2 = h2;
        while(cur1!=null&&cur2!=null){
            while(cur1!=null&&cur2.val > cur1.val){
                pre1 = cur1;
                cur1 = cur1.next;
            }
            pre2 = cur2;
            cur2 = cur2.next;
            pre2.next = cur1;
            pre1.next = pre2;

        }
        return null;
    }
}
