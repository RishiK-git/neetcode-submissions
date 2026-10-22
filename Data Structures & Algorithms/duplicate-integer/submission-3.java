class Solution {
    public boolean hasDuplicate(int[] nums) {
        
       HashSet<Integer> i = new i<Integer>();

       for(int num : nums){

        if(!i.add(num)){

            return true;
        }
       }
    
    return false;
    }
   
}
