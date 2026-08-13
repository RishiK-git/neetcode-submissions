class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        int[] answer = new int[nums.length];
        

        int firstProduct = 1;
        for(int i = 0; i < nums.length; i++){

            firstProduct = firstProduct * nums[i];
        }

        

        for(int i = 0; i < nums.length; i++){
            if(nums[i]!=0){
                answer[i] = firstProduct / nums[i];
                
            } else{
                int product = 1;
                for(int j = 0; j < nums.length; j++){
                    if(j!=i){
                        product = product * nums[j];
                    }
                    answer[i] = product;
                }
            }
            
        }

        
        return answer;

    }
}  
