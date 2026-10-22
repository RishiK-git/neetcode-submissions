class Solution {
    public boolean isAnagram(String s, String t) {

        if(s.length() != t.length()){

            return false;
        }

       HashMap<char, Integer> sSet = new HashMap<char, Integer>();
       HashMap<char, Integer> tSet = new HashMap<char, Integer>();


       for(int i = 0; i < s.length(); i++){

            sSet.put(s.charAt(i), sSet.getOrDefault(s.charAt(i), 0) + 1);
            
            
       }
       for(int j = 0; j < t.length(); j++){

            tSet.put(t.charAt(j), tSet.getOrDefault(t.char(j), 0) + 1);
            
       }

       for (Map.Entry<char, Integer> entry : tSet.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key + ": " + value);
        }

       return sSet.equals(tSet);    

    }
}
