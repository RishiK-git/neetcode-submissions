class Solution:
    def twoSum(self, numbers: List[int], target: int) -> List[int]:
        endIndex = len(numbers) - 1
        startIndex = 0
        output = []
        for i in range(len(numbers)):
            print(numbers[startIndex] + numbers[endIndex])
            if numbers[startIndex] + numbers[endIndex] > target:
                print("end")
                endIndex -= 1
            elif numbers[startIndex] + numbers[endIndex] < target:
                print("start")
                startIndex += 1
            else:
                print("through")
                output.append(startIndex + 1)
                output.append(endIndex + 1)
                return output
        