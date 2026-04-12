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
        int one = 0;
        int multiplier = 1;
        while(l1 != null) {
            one += l1.val * multiplier;
            multiplier *= 10;
            l1 = l1.next;
        }

        int two = 0;
        multiplier = 1;
        while(l2 != null) {
            two += l2.val * multiplier;
            multiplier *= 10;
            l2 = l2.next;
        }

        int result = one + two;
        int divisor = 10;
        ListNode dummy = new ListNode(0);
        ListNode dResult = dummy;
        if(result == 0) {
            return new ListNode(0);
        } else {
            while(result != 0) {
                int d2 = divisor;
                if(d2 != 0) {
                    d2 = d2/10;
                }
                int val = (result % divisor) / (d2);
                //val = val / d2 /10;
                ListNode node = new ListNode(val);
                dummy.next = node;
                dummy = dummy.next;
                divisor *= 10;
                result = result - (val * d2);
            }
        }

        return dResult.next;
    }
}
