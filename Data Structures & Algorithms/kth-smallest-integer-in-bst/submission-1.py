# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right

class Solution:
    def kthSmallest(self, root: Optional[TreeNode], k: int) -> int:
        count = k
        res = 0
        def inorder(root):
            nonlocal count, res
            if not root:
                return
            
            count = count - 1
            inorder(root.left)
            if count == 0:
                res = root.val
            inorder(root.right)
        
        inorder(root)
        return res
            