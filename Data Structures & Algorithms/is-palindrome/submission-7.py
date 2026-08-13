class Solution:
    def isPalindrome(self, s: str) -> bool:
        word = ""
        for char in s:
            if char.isalnum():
                word += char.lower()

        print(word)

        endIndex = len(word) - 1
        for i in range(len(word)):
            if word[i] != word[endIndex]:
                return False
            endIndex -= 1


        return True