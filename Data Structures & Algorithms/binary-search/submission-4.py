class Solution:
    def search(self, nums: List[int], target: int) -> int:
        left = 0
        right = len(nums) - 1
        middle = right // 2

        while (right - left) > 1:
            print("left:", left, "right:", right )
            if nums[middle] == target:
                return middle
            elif nums[middle] > target:
                right = middle
                middle = (right + left) // 2
            elif nums[middle] < target:
                left = middle
                middle = (right + left) // 2

        return -1