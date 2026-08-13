class Solution {
    public int longestConsecutive(int[] nums) {
        
        HashSet<Integer> set = new HashSet<>();
        
        // populate the set
        for(int i=0; i<nums.length; i++){
            set.add(nums[i]);
        }

        if(set.size() == 1){return 1;}

        int maxLength = 0;
        
        for(Integer n : set){

            if(set.contains(n + 1) && !set.contains(n - 1)){
                

                int length = 1;
            
                int num = n;
                while(set.contains(num + 1)){

                    length++;
                    num++;
                }
                if(length > maxLength){

                    maxLength = length;
                }
                
            }
        }

        

    

    


        return maxLength;
    }
}
