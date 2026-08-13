class Solution {
    public boolean hasDuplicate(int[] nums) {
        
        HashSet<Integer> n = new HashSet<Integer>();

        for(int s: nums){
            if(!n.add(s)){

                return true;
            }

        
    }
    return false;
    }    
   
}
