class Solution {
    
    public int[] twoSum(int[] nums, int target) {

      HashMap<Integer, Integer> diff = new HashMap<>();

      for (int i = 0; i < nums.length; i++){

            int d = target - nums[i];

            if(diff.containsKey(nums[1])){

                int[] index = new int[]{i , diff.get(d)};
                Arrays.sort(index);
                return index;

            }
            diff.put(d, i);

        }
    }
    return new int[]{0, 1};

}