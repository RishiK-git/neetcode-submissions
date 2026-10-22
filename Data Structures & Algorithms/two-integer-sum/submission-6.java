class Solution {
    
    public int[] twoSum(int[] nums, int target) {

      HashMap<Integer, Integer> diff = new HashMap<>();

      for (int i = 0; i < nums.length; i++){

        int d = target - nums[i];
        // difference and index from target at each index
        diff.put(d, i);

      }

      for(int j = 0; j < nums.length; j++) {
        
        // 3 4 5 6
        // 10

        if(diff.containsKey(target - nums[j])) {

            int[] index = new int[]{j , diff.get(j)};
            Arrays.sort(index);
            
        
        }
        
      }
      return index;
      
    }
}