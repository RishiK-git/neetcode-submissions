# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next

class Solution:
    def hasCycle(self, head: Optional[ListNode]) -> bool:
        slow_pointer = head
        fast_pointer = head
        
        steps = 1
        while fast_pointer != None:
            for i in range (steps):
                fast_pointer = fast_pointer.next
                if fast_pointer.next == None:
                    return False
            steps = steps + 1

            slow_pointer = slow_pointer.next
            if slow_pointer == fast_pointer:
                return True
            