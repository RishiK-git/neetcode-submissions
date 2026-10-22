class Solution:
    def maxArea(self, heights: List[int]) -> int:
        l, r = 0, len(heights) - 1
        maxVol = min(heights[l], heights[r]) * (r - l)
        while l < r:
            best = "none"
            possibleNewMax = maxVol

            if min(heights[l], heights[r - 1]) * ((r - 1) - l) >= possibleNewMax:
                r-=1
                possibleNewMax = min(heights[l], heights[r]) * (r - l)
                best = "right"
                r+=1
            if min(heights[l + 1], heights[r]) * (r - (l + 1)) >= possibleNewMax:
                l+=1
                possibleNewMax = min(heights[l], heights[r]) * (r - l)
                best = "left"
                l-=1

            if min(heights[l + 1], heights[r - 1]) * ((r - 1) - (l + 1)) >= possibleNewMax:
                l+=1
                r-=1
                possibleNewMax = min(heights[l], heights[r]) * (r - l)
                best = "both"
                l-=1
                r+=1

            if best == "right":
                r-=1
            elif best == "left":
                l+=1
            elif best == "both":
                l+=1
                r-=1
            elif best == "none":
                l+=1
   
            maxVol = possibleNewMax

        return maxVol    