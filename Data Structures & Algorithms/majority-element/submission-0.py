class Solution:
    def majorityElement(self, nums: List[int]) -> int:
        s = {}
        n = len(nums)
        for i in nums:
            s[i] = s.get(i, -1) + 1
            if s[i] == n // 2:
                return i
        
