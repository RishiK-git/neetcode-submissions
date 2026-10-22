class Solution:
    def search(self, nums: List[int], target: int) -> int:
        left, right = 0, len(nums) - 1
        middleIndex = (right + left) // 2
        while left != right:
            if target > nums[middleIndex]:
                left = middleIndex
            elif target < nums[middleIndex]:
                right = middleIndex
            else: 
                return middleIndex
            
            middleIndex = (right + left) // 2

        return -1