class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
        int c = k;
        ArrayList<Integer>[] a = new ArrayList[nums.length + 1];

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < nums.length; i++){

            if(!map.containsKey(nums[i])){

                map.put(nums[i], 1);
            }
            else{

                map.put(nums[i], map.get(nums[i]) + 1);
            }

        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                if(a[entry.getValue()] == null){

                    a[entry.getValue()] = new ArrayList<Integer>();
                }

                a[entry.getValue()].add(entry.getKey());
        }

        int[] n = new int[k];
        int index = 0;

        for(int i = a.length - 1; i >= 0; i--){

            if(a[i]!=null && c!=0){

                for(int j = 0; j < a[i].size(); j++){
                    n[index] = a[i].get(j);
                    index++;
                    c--;
                }
            }
            if(c == 0){break;}
        }


        return n;
    }
}
