# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next

class Solution:
    def reverseList(self, head: Optional[ListNode]) -> Optional[ListNode]:
        new_list = ListNode(0, None)

        trail = None
        curr = head
        while curr:
            temp = curr.next
            curr.next = trail
            trail = curr
            curr = temp

        return trail   
        
        



        




