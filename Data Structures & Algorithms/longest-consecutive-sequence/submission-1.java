class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        HashSet<Integer> sequenceStarts = new HashSet<>();

        if(nums.length == 1){return 1;}
        
        // populate the set
        for(int i=0; i<nums.length; i++){
            set.add(nums[i]);
        }

        for(Integer n : set){

            if(set.contains(n + 1) && !set.contains(n - 1)){

                sequenceStarts.add(n);
            }
        }

        int maxLength = 0;

        for(Integer n : sequenceStarts){
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

    


        return maxLength;
    }
}
