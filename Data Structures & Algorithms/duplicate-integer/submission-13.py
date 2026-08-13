class Solution:
    def hasDuplicate(self, nums: List[int]) -> bool:
        ints = set()
        for n in nums:
            if (n in ints):
                return True
            ints.add(n)
        return False
        