class Solution {
    public int maxArea(int[] heights) {
        
        int leftP = 0;
        int rightP = heights.length - 1;
        int mostWater = 0;

        for(int i = 0; i < heights.length; i++){

            for(int j = 0; j < heights.length; j++){
                if(Math.abs(i - j) * Math.min(heights[i], heights[j]) > mostWater){
                    mostWater = Math.abs(i - j) * Math.min(heights[i], heights[j]);
                }
            }
        }

        // while(leftP < rightP){

        //     int minHeight = Math.min(heights[leftP], heights[rightP]);
        //     int area = (rightP - leftP) * minHeight;



            
        //     if(area > mostWater) {
        //         mostWater = area;
        //     }
            
        //     if(heights[leftP + 1] > minHeight){
        //         leftP++;
        //     }
        //     if(heights[rightP - 1] > minHeight){
        //         rightP--;
        //     }
            
        // }

        return mostWater;
    }
}
 