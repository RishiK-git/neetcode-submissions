class Solution:
    def findErrorNums(self, nums: List[int]) -> List[int]:
        output = []
        cp = nums.copy()
        cp.sort()
        
        for i in range(len(cp)):
            if i == 0:
                continue
            if cp[i - 1] == cp[i]:
                output.append(cp[i - 1])
                output.append(cp[i] + 1)

        return output