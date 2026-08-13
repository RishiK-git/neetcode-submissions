class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        int[] answer = new int[nums.length];
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();



        for(int i = 0; i < nums.length; i++){

            int product = 1;
            if(!map.containsKey(nums[i])){

                for(int j = 0; j < nums.length; j++){

                    if(i!=j){

                        product = product * nums[j];
                    }
                    answer[i] = product;
                }
            }
            else{

                answer[i] = map.get(nums[i]);
            }
            
        }

        return answer;


    }
}  
