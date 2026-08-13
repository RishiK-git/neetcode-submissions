class Solution {
    
    public int[] twoSum(int[] nums, int target) {

      HashMap<Integer, Integer> diff = new HashMap<>();

      for (int i = 0; i < nums.length; i++){

            int d = target - nums[i];

            if(diff.containsKey(d)){

                int[] index = new int[]{i , diff.get(d)};
                Arrays.sort(index);
                return index;

            }
            diff.put(nums[i], i);

        }

        int[] s = new int[]{0, 1};
        return s;
    }
    
}