class Solution:
    def findKthLargest(self, nums: List[int], k: int) -> int:
        # Sort in descending order and return the kth element
        nums.sort(reverse=True)
        return nums[k - 1]