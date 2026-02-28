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
    public ListNode deleteMiddle(ListNode head) {
        int count=0;
        ListNode curr=head;
        if(head==null || head.next==null){
            return null;
        }
        while(curr!=null){
            count++;
            curr=curr.next;
        }
        int n=count;
        int mid=n/2;
        ListNode curr2=head;
        for(int i=0;i<mid-1;i++){
            curr2=curr2.next;
        }
        curr2.next=curr2.next.next;
        return head;
    }
}