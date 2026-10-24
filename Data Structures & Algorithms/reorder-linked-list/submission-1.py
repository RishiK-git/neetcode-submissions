# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next

class Solution:
    def reorderList(self, head: Optional[ListNode]) -> None:
        len_list = 0
        node = head
        while node:
            node = node.next
            len_list = len_list + 1

        if len_list < 2:
            return

        l2 = head
        prev = None
        count = len_list = len_list // 2

        while count and l2:
            prev = l2 
            l2 = l2.next
            count = count - 1

        prev.next = None
        trail = None
        while l2:
            temp = l2.next
            l2.next = trail
            trail = l2
            l2 = temp

        l2_head = trail
        l1_head = head
        ret_val = res = ListNode()
        while l1_head and l2_head:
            n1, n2 = l1_head.next, l2_head.next 
            res.next = l1_head
            res = res.next
            res.next = l2_head
            res = res.next
            l1_head, l2_head = n1, n2


        if l2_head:
            res.next = l2_head
        
        

        

        



        




        
        
            

        

        