class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> perms = new ArrayList<>();
        permHelp(perms, new ArrayList<>(), nums, new boolean[nums.length]);
        return perms;
    }

    private void permHelp(List<List<Integer>> perms, List<Integer> soFar, int[] nums, boolean[] used) {
        if (soFar.size() == nums.length) {
            perms.add(new ArrayList<>(soFar));
            return;
        }
        
        for (int i = 0; i < nums.length; i++) {
            
            if (used[i]) {continue;}
            soFar.add(nums[i]);
            used[i] = true;
            permHelp(perms, soFar, nums, used);
                
            soFar.remove(soFar.size() - 1);
            used[i] = false;
        }
        
    }
}
