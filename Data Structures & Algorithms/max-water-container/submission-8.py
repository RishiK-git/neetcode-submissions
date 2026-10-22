class Solution:
    def maxArea(self, heights: List[int]) -> int:
        l, r = 0, len(heights) - 1
        maxVol = min(heights[l], heights[r]) * (r - l)
        while l < r:
            if heights[l + 1] > heights[l]:
                l += 1
            elif heights[r - 1] > heights[r]:
                r -= 1
            else:
                l += 1
                break
            
            if min(heights[l], heights[r]) * (r - l) > maxVol:
                maxVol = min(heights[l], heights[r]) * (r - l)

        return maxVol
