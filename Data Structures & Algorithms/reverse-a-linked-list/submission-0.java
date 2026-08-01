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
    public ListNode reverseList(ListNode head) {
        // ListNode previousNode = null;
        // ListNode currentNode = head;

        // while (currentNode != null){
        //     ListNode nextNode = currentNode.next;
        //     currentNode.next = previousNode;
        //     previousNode = currentNode;
        //     currentNode = nextNode;
        // }
        // return previousNode;

        if (head == null || head.next == null) {
                return head; // Base case
            }
            ListNode newHead = reverseList(head.next); // Recursive call
            head.next.next = head; // Reverse the pointer
            head.next = null; // Prevent cycle
            return newHead; // Return the new head     
    }

}
