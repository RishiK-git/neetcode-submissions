class Solution:
    def maxArea(self, heights: List[int]) -> int:

        l, r = 0, len(heights) - 1
        maxVol = min(heights[l], heights[r]) * (r - l)
        while l < r:
            
            if heights[l] < heights[r]:
                l += 1
            elif heights[r] < heights[l]:
                r -= 1
            else:
                l += 1

            if min(heights[l], heights[r]) * (r - l) > maxVol:
                maxVol = min(heights[l], heights[r]) * (r - l)
            
            

        return maxVol
