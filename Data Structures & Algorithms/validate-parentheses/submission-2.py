class Solution:
    def isValid(self, s: str) -> bool:
        stack = []
        for char in s:
            print(char, "here")
            if char == '(' or char == '[' or char == '{':
                stack.append(char)
            elif char == ")":
                c = stack.pop()
                print(c)
                if c != '(':
                    return False
            elif char == "]":
                c = stack.pop()
                print(c)
                if c != '[':
                    return False
            elif char == "}":
                c = stack.pop()
                print(c)
                if c != '{':
                    return False


        return len(stack) == 0

        