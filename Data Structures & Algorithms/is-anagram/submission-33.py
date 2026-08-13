class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        if (len(s) != len(t)): return False

        sCount = {}
        tCount = {}

        for char in s:
            if (char not in sCount):
                sCount[char] = 1
            else:
                sCount[char] = sCount[char] + 1

        for char in t:
            if (char not in tCount):
                tCount[char] = 1
            else:
                tCount[char] = tCount[char] + 1

        return sCount == tCount

