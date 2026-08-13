class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(int i = 0; i < nums.length; i++){

            if(!map.containsKey(nums[i])){

                map.put(nums[i], 1);
            }
            else{

                map.put(nums[i], map.get(nums[i]) + 1);
            }
            
            
        }

        List<Map.Entry<Integer, Integer>> entryList = new ArrayList<>(map.entrySet());

        entryList.sort((a, b) -> b.getValue() - a.getValue());
        

        int[] a = new int[k];

        for(int i = 0; i < k; i++){

            a[i] = entryList.get(i).getKey();
        }


        return a;

    }
}
