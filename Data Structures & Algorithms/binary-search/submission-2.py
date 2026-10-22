class Solution:
    def search(self, nums: List[int], target: int) -> int:
        left, right = 0, len(nums) - 1
        while left != right and right - left != 1:
            middleIndex = (right + left) // 2
            if target > nums[middleIndex]:
                left = middleIndex
            elif target < nums[middleIndex]:
                right = middleIndex
            else: 
                return middleIndex
            
            

        return -1