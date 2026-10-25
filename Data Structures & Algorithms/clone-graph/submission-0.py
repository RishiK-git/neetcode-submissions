class Solution:
    def cloneGraph(self, node: Optional['Node']) -> Optional['Node']:
        cloned = {}                          # changed: set -> dict (original -> clone)
        res = cnode = node

        def dfs(node):
            if node == None:
                return

            if node in cloned:               # added: reuse existing clone
                return cloned[node]

            ret = Node(node.val)             # changed: no neighborsCopy, start with empty list
            cloned[node] = ret               # changed: register clone before recursing
            for n in node.neighbors:
                ret.neighbors.append(dfs(n)) # changed: always recurse, append the clone

            return ret

        res = dfs(node)
        return res