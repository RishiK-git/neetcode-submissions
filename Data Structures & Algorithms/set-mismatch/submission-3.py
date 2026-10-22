class Solution:
    def findErrorNums(self, nums: List[int]) -> List[int]:
        output = []
        nums.sort()
        for i in range(len(nums)):
            if i == 0:
                continue
            if nums[i - 1] == nums[i]:
                output.append(nums[i - 1])
                output.append(nums[i] + 1)

        return output