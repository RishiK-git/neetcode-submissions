class Solution {
    public boolean isAnagram(String s, String t) {

        if(s.length() != t.length()){

            return false;
        }

       TreeMap<String, Integer> sSet = new TreeMap<String, Integer>();
       TreeMap<String, Integer> tSet = new TreeMap<String, Integer>();


       for(int i = 0; i < s.length(); i++){

            sSet.put(s.substring(i, i + 1), sSet.getOrDefault(s.substring(i, i + 1), 0) + 1);
            
       }
       for(int j = 0; j < t.length(); j++){

            tSet.put(t.substring(j, j + 1), tSet.getOrDefault(t.substring(j, j + 1), 0) + 1);
            
       }

       for (Map.Entry<String, Integer> entry : tSet.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key + ": " + value);
        }

       return sSet.equals(tSet);

    //    for (letters.Entry<String, Integer> entry : letters.entrySet()) {
    //         String key = entry.getKey();
    //         int value = entry.getValue();
    //         if ()
    //     }

    

    }
}
