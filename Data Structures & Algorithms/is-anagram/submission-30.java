class Solution {
    public boolean isAnagram(String s, String t) {

        if(s.length() != t.length()){

            return false;
        }

       HashMap<Character, Integer> sSet = new HashMap<Character, Integer>();
       HashMap<Character, Integer> tSet = new HashMap<Character, Integer>();


       for(int i = 0; i < s.length(); i++){

            sSet.put(s.charAt(i), sSet.getOrDefault(s.charAt(i), 0) + 1);
            
            
       }
       for(int j = 0; j < t.length(); j++){

            tSet.put(t.charAt(j), tSet.getOrDefault(t.charAt(j), 0) + 1);
            
       }

       for (Map.Entry<Character, Integer> entry : tSet.entrySet()) {
            Character key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key + ": " + value);
        }

       return sSet.equals(tSet);    

    }
}
