# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next

class Solution:
    def mergeTwoLists(self, list1: Optional[ListNode], list2: Optional[ListNode]) -> Optional[ListNode]:
        curr1 = list1
        curr2 = list2

        dummy = ListNode(None, None)
        tail = dummy

        while curr1 and curr2:
            print(tail.val)
            if curr1.val <= curr2.val:
                tail.next = ListNode(curr1.val, curr1.next)
                tail = tail.next
                curr1 = curr1.next
            else:
                tail.next = ListNode(curr2.val, curr2.next)
                tail = tail.next
                curr2 = curr2.next



        if curr1:
            tail.next = curr1
        elif curr2:
            tail.next = curr2

        output = dummy.next

        return output

        


        