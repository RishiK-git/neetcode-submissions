class Solution:
    def removeNthFromEnd(self, head: Optional[ListNode], n: int) -> Optional[ListNode]:
        l = r = head
        prev = None
        for i in range(n):
            r = r.next

        while r:
            prev = l
            l = l.next
            r = r.next

        if prev is None:          # removing the head
            return head.next

        prev.next = l.next
        return head               # you were missing this return