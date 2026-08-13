class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashMap<Integer, Integer> val = new HashMap<Integer, Integer>();

        for (int i = 0; i < nums.length; i++) {
            if (val.containsKey(nums[i])) {
                return true;
            }
            val.put(nums[i], 0);
        }
        return false;
    }
}
