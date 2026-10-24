# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next

class Solution:
    def mergeTwoLists(self, list1: Optional[ListNode], list2: Optional[ListNode]) -> Optional[ListNode]:
        if list1 == None:
            return list2
        if list2 == None:
            return list1

        l1 = list1
        l2 = list2
        n_node = 0
        
        val_start = 0
        if list1.val <= list2.val:
            val_start = list1.val
            n_node = list1
            l1 = l1.next
        else:
            val_start = list2.val
            n_node = list2
            l2 = l2.next

        head = n_node

        while l1 and l2:
            if l1.val <= l2.val:
                n_node.next = l1
                l1 = l1.next
            else:
                n_node.next = l2
                l2 = l2.next
            n_node = n_node.next
        
        if l1:
            n_node.next = l1
        elif l2:
            n_node.next = l2


        return head
        