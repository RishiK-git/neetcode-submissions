class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        
        Arrays.sort(nums);

        int leftP = 0;
        int rightP = nums.length -1;

        List<List<Integer>> a = new ArrayList<>();

        for(int i = 0; i < nums.length; i++){

            // if sum negative
            if(nums[leftP]+nums[rightP] < 0){
                int firstNum = nums[leftP];
                int secNum = nums[rightP];
                int target = nums[leftP]+nums[rightP] * -1;
                while(nums[rightP] >= 0){
                    rightP--;
                    if(nums[rightP] == target){
                        List<Integer> triple = new ArrayList<>();
                        triple.add(firstNum);
                        triple.add(secNum);
                        triple.add(target);
                        break;
                    }
                }
                continue;
            }
            // if sum positive
            if(nums[leftP]+nums[rightP] > 0){
                int firstNum = nums[leftP];
                int secNum = nums[rightP];
                int target = nums[leftP]+nums[rightP] * -1;
                while(nums[leftP] <= 0){
                    leftP--;
                    if(nums[leftP] == target){
                        List<Integer> triple = new ArrayList<>();
                        triple.add(firstNum);
                        triple.add(secNum);
                        triple.add(target);
                        break;
                    }
                }
                continue;
            }



        }

        List<List<Integer>> a = new ArrayList<>();
        return a;
    }
}
