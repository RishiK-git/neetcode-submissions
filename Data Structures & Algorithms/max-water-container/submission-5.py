class Solution:
    def maxArea(self, heights: List[int]) -> int:
        l, r = 0, len(heights) - 1
        maxVol = min(heights[l], heights[r]) * (r - l)
        while l < r:
            changed = False

            possibleNewMax = maxVol

            if min(heights[l], heights[r - 1]) * ((r - 1) - l) >= possibleNewMax:
                r-=1
                possibleNewMax = min(heights[l], heights[r]) * (r - l)

            if min(heights[l + 1], heights[r]) * (r - (l + 1)) >= possibleNewMax:
                l+=1
                possibleNewMax = min(heights[l], heights[r]) * (r - l)

            if min(heights[l + 1], heights[r - 1]) * ((r - 1) - (l + 1)) >= possibleNewMax:
                l+=1
                r-=1
                possibleNewMax = min(heights[l], heights[r]) * (r - l)

            if not changed:
                l+=1

            maxVol = possibleNewMax

        return maxVol    