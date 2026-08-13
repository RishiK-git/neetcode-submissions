class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        output = []
        if len(nums) < 3: return []
        nums.sort()
        if len(nums) == 3 and sum(nums) == 0: 
            output.append(nums)
            return output
        for i in range(len(nums)):
            startIndex = i + 1
            endIndex = len(nums) - 1
            copied = False
            if (endIndex - startIndex == 1):
                break
            for j in range(len(nums) - 2 - i):
                if not copied:
                    copyStart = startIndex
                    copyEnd = endIndex
                    copied = True
                if copyStart == copyEnd: break
                if (nums[i] + nums[copyStart] + nums[copyEnd]) > 0: 
                    copyEnd -= 1
                elif (nums[i] + nums[copyStart] + nums[copyEnd]) < 0: 
                    copyStart += 1
                else:
                    currTriple = []
                    currTriple.append(nums[i])
                    currTriple.append(nums[copyStart])
                    currTriple.append(nums[copyEnd])
                    currTriple.sort()
                    copyEnd-=1
                    copyStart+=1
                    if currTriple not in output:
                        output.append(currTriple)

    
        return output  