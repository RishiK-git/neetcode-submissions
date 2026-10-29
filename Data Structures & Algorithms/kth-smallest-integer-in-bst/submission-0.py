# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right

class Solution:
    def kthSmallest(self, root: Optional[TreeNode], k: int) -> int:
        vals = []
        
        def bfs(root):
            if not root:
                return
            
            vals.append(root.val)
            bfs(root.left)
            bfs(root.right)            

        bfs(root)

        print(vals)
        vals.sort()
        pos = 0
        for i in range(k):
            pos = i
        
        return vals[pos]