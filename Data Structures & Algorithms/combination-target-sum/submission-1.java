class Solution {

    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>> lists = new ArrayList<>();
        helper(lists, new ArrayList<Integer>(), nums, target, 0);
        return lists;
    }

    private void helper(
        List<List<Integer>> lists, 
        List<Integer> numsSoFar, 
        int[] nums, 
        int tgt, 
        int sum) {
            if (sum > tgt) {
                return;
            }
            
            if (sum == tgt) {
                List<Integer> snapshot = new ArrayList<>(numsSoFar);
                Collections.sort(snapshot);
                if (!lists.contains(snapshot)) {
                    lists.add(snapshot);
                }
            }
            
            for (int i = 0; i < nums.length; i++) {
                numsSoFar.add(nums[i]);
                sum += nums[i];
                helper(lists, numsSoFar, nums, tgt, sum);
                sum -= nums[i];
                numsSoFar.remove(numsSoFar.size() - 1);
            }

        }


}
