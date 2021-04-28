import java.util.Scanner;

/**
 * @author wlp
 * @create 2021-04-18 14:02
 */
public class LC147 {
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
    public static void main(String[] args) {
        LC147 pro = new LC147();
        Scanner scanner = new Scanner(System.in);
        String[] val = scanner.nextLine().split(",");
        int len = val.length;
        ListNode head = new ListNode();
        ListNode last = head;
        for(String s : val){
            ListNode node = new ListNode(Integer.parseInt(s));
            last.next = node;
            last = node;
        }

        ListNode res = pro.insertionSortList(head.next);
        while (res != null){
            if(res.next == null){
                System.out.print(res.val);
                break;
            }
            System.out.print(res.val + ",");
            res = res.next;


        }

    }

    public ListNode insertionSortList(ListNode head){
        if(head == null || head.next == null){
            return head;
        }
        ListNode newHead = new ListNode();
        newHead.next = head;
        ListNode preIn,curIn;
        preIn = curIn = head.next;
        head.next = null;
        ListNode pre,cur;
        pre = newHead;
        cur = head;
        while(curIn!=null){
            while(cur!=null && curIn.val > cur.val){
                pre = cur;
                cur = cur.next;

            }
            preIn = curIn;
            curIn = curIn.next;
            preIn.next = pre.next;
            pre.next = preIn;

            pre = newHead;
            cur = pre.next;

        }
        return newHead.next;
    }
}
