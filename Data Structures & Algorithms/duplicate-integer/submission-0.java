class Solution {
    public boolean hasDuplicate(int[] nums) {
        
        HashSet<Integer> n = new HashSet<Integer>();

        for(int s: nums){
            if(!n.contains(s)){

                n.add(s);
            }
            else{

                return true;
            }
            
        }

        return false;
    }    
   
}
