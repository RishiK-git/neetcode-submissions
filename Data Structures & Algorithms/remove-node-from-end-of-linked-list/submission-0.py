# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next

class Solution:
    def removeNthFromEnd(self, head: Optional[ListNode], n: int) -> Optional[ListNode]:
        if n == 1:
            return None
        slow = head
        trail = head
        fast = head
        for i in range (n):
            fast = fast.next
        
        slow = slow.next
        while fast.next:
            fast = fast.next
            slow = slow.next
            trail = trail.next

        trail.next = slow.next
        slow.next = None

        return head



        