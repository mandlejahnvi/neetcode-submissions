/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp=head;
        int count=0;
        
        while(temp!=null)
        {
            count++;
            temp=temp.next;
        }
        count=count-n+1;
        temp=head;
        if (count == 1)
            return head.next;
        while(temp!=null)
        {
            if(count==2)
            {
                temp.next=temp.next.next;
                break;
            }
            temp=temp.next;
            count--;
        }
        return head;
    }
    
}
