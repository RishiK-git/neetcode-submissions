# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next

class Solution:
    def reorderList(self, head: Optional[ListNode]) -> None:
        
        slow = head
        fast = head
        while fast and fast.next:
            slow = slow.next
            fast = fast.next.next

        
        # head of second half of linked list
        second_half_list = slow.next
        # cutting off first list from second
        slow.next = None

        trail = None
        curr = second_half_list
        # reversing second halfs link direction
        while curr:
            temp = curr.next
            curr.next = trail
            trail = curr
            curr = temp

        second_list_curr = trail

        first_list_curr = head


        while second_list_curr:
            first_temp = first_list_curr.next
            second_temp = second_list_curr.next
            first_list_curr.next = second_list_curr
            second_list_curr.next = first_temp
            first_list_curr = first_temp
            second_list_curr = second_temp

        



        




        
        
            

        

        