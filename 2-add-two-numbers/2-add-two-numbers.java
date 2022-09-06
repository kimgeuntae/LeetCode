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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
        ListNode result = new ListNode();
		ListNode temp = result;
		int carry = 0;
		
		while(l1 != null || l2 != null || carry == 1) {
			
			int sum = ((l1 == null) ? 0 : l1.val) + ((l2 == null) ? 0 : l2.val) + carry;
			ListNode curNode = new ListNode(sum%10);
			carry = sum / 10;
			
			temp.next = curNode;
			temp = curNode;
			
			if(l1 != null) l1 = l1.next;
			if(l2 != null) l2 = l2.next;
			
		}
		
        return result.next;
    }
}