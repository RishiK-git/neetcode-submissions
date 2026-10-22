class Solution:
    def isPalindrome(self, s: str) -> bool:
        word = ""
        for char in s:
            if char.isalnum():
                word += char

        endIndex = len(s) - 1
        for i in range(len(s)):
            if s[i] != s[endIndex]:
                return False


        return True