class Solution {
    public int maxArea(int[] heights) {
        
        int leftP = 0;
        int rightP = heights.length - 1;
        boolean leftWall = false;
        boolean rightWall = false;

        int mostWater = 0;

        while(leftP < rightP){

            int minHeight = Math.min(heights[leftP], heights[rightP]);
            int area = (rightP - leftP) * minHeight;


            
            if(area > mostWater) {
                mostWater = area;
            }
            
            if (heights[leftP] < heights[rightP]) {
                leftP++;
            } else {
                rightP--;
            }

            
        }

        return mostWater;  
    }
}
 