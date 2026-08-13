class Solution:
    def twoSum(self, numbers: List[int], target: int) -> List[int]:
        endIndex = len(numbers) - 1
        startIndex = 0
        output = []
        for i in range(len(numbers)):
            if numbers[startIndex] + numbers[endIndex] > target:
                endIndex -= 1
            elif numbers[startIndex] + numbers[endIndex] < target:
                startIndex += 1
            else:
                output.append(startIndex + 1)
                output.append(endIndex + 1)
                return output
        