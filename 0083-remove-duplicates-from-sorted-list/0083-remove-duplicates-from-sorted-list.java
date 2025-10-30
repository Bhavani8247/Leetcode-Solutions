class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        // If the list is empty or has only one node
        if (head == null || head.next == null) {
            return head;
        }

        ListNode current = head;

        // Traverse the list
        while (current != null && current.next != null) {
            if (current.val == current.next.val) {
                // Skip the duplicate node
                current.next = current.next.next;
            } else {
                // Move to the next distinct element
                current = current.next;
            }
        }

        return head;
    }
}
