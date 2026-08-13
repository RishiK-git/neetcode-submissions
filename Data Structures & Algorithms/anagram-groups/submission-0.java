class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        List<List<String>> groups = new ArrayList<>();

        //int[] copy = Arrays.copyOf(strs, strs.length);
        
        HashMap<String, ArrayList<Integer>> map = new HashMap<>();

        for(int i = 0; i < strs.length; i++){
            

            if(!map.containsKey(alpha(strs[i]))){
                
                ArrayList<Integer> index = new ArrayList<>();
                index.add(i);
                map.put(alpha(strs[i]), index);
            }
            else{

                map.get(alpha(strs[i])).add(i);
            }
    
        }


        for (Map.Entry<String, ArrayList<Integer>> entry : map.entrySet()) {
            String key = entry.getKey();
            ArrayList<Integer> list = entry.getValue();
            
            ArrayList<String> g = new ArrayList<>();
            
            for(int i = 0; i < list.size(); i++){
                g.add(strs[list.get(i)]);

            }

            groups.add(g);
            
        }
        return groups;
    }



    public String alpha(String word){

        char[] a = word.toCharArray();
        Arrays.sort(a);
        String str = new String(a);
        return str;
    }
}
