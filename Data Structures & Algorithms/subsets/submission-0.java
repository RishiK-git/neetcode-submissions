class Solution {

    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> sets = new ArrayList<>();
        subsetsHelper(sets, new ArrayList<Integer>(), nums, 0);
        return sets;
    }

    private void subsetsHelper(
        List<List<Integer>> s, 
        ArrayList<Integer> subSoFar,
        int[] nums,
        int index) {

        if (!s.contains(subSoFar)) {
            s.add(new ArrayList<>(subSoFar));
        }

        for (int i = index; i < nums.length; i++) {
            subSoFar.add(nums[i]);
            subsetsHelper(s, subSoFar, nums, i + 1);
            subSoFar.remove(subSoFar.size() - 1);
        }

    }
}
