class Solution {
    public boolean isAnagram(String s, String t) {

        if(s.length() != t.length()){

            return false;
        }

       HashMap<String, Integer> sSet = new HashMap<String, Integer>();
       HashMap<String, Integer> tSet = new HashMap<String, Integer>();


       for(int i = 0; i < s.length(); i++){

            sSet.put(s.substring(i, i + 1), sSet.getOrDefault(s.substring(i, i + 1), 0) + 1);
            tSet.put(t.substring(i, i + 1), tSet.getOrDefault(t.substring(i, i + 1), 0) + 1);
            
       }
    //    for(int j = 0; j < t.length(); j++){

    //         tSet.put(t.substring(j, j + 1), tSet.getOrDefault(t.substring(j, j + 1), 0) + 1);
            
    //    }

       for (Map.Entry<String, Integer> entry : tSet.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key + ": " + value);
        }

       return sSet.equals(tSet);    

    }
}
