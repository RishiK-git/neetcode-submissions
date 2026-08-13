class Solution {
    
    public int[] twoSum(int[] nums, int target) {

        int[] arr = new int[2];
        
        //Array arr = new int[2];
        
        for(int x = 0; x < nums.length; x++) {

            for(int i = 0; i < nums.length; i++){

                if(x != i) {

                    if(nums[x] + nums[i] == target){

                        arr[0] = x;
                        arr[1] = i;

                        return arr;
                    }

                }

            }
        }
        return arr;
    }
}