# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right


## 1. Restatement Find the k-th smallest value in a BST (1-indexed).

## 2. Approach In-order traversal of a BST yields values in sorted ascending order. Decrement a counter on each visit; when it hits 0, record the current node's value.

## 3. Solution

class Solution:
    def kthSmallest(self, root: Optional[TreeNode], k: int) -> int:
        self.k = k
        self.result = 0
        
        def inorder(node):
            if not node:
                return
            inorder(node.left)
            self.k -= 1
            if self.k == 0:
                self.result = node.val
                return
            inorder(node.right)
        
        inorder(root)
        return self.result
