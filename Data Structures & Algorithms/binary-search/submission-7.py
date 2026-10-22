class Solution:
    def search(self, nums: List[int], target: int) -> int:
        left = 0
        right = len(nums) - 1
        middle = right // 2

        print("left:", left, "middle:", middle, "right:", right)

        
        while True :
            if nums[middle] == target:
                return middle
            elif nums[middle] > target:
                right = middle
                middle = (right + left) // 2
            elif nums[middle] < target:
                left = middle
                middle = (right + left) // 2

            if not ((right - left) > 0):
                break

        return -1