class Solution:
    def isValid(self, s: str) -> bool:
        stack = []
        for char in s:
            if char == '(' or char == '[' or char == '{':
                stack.append(char)
                continue
            if len(stack) == 0:
                return False
            if char == ")":
                c = stack.pop()
                if c != '(':
                    return False
            elif char == "]":
                c = stack.pop()
                if c != '[':
                    return False
            elif char == "}":
                c = stack.pop()
                if c != '{':
                    return False


        return len(stack) == 0

        