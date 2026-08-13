class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        diffs = {}
        
        for i, num in enumerate(nums):
            currDiff = target - num
            if num in diffs:
                return [diffs[num], i]
            else:
                diffs[currDiff] = i
                
        