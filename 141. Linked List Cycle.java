public class Solution {
    public boolean hasCycle(ListNode head) {       
        ListNode slow=head;
        ListNode fast=head;
        //if(cur==null||cur.next==null||cur.next.next==null)return false;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast)return true;
        }
        return false;
    
    }
}
