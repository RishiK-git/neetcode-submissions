class Solution {
    public boolean isAnagram(String s, String t) {

        if(s.length() != t.length()){

            return false;
        }

       TreeMap<String, Integer> sSet = new TreeMap<String, Integer>();
       TreeMap<String, Integer> tSet = new TreeMap<String, Integer>();


       for(int i = 0; i < s.length(); i++){

            sSet.put(s.substring(i, i + 1), sSet.get(s.substring(i, i + 1)));
            
       }
       for(int j = 0; j < t.length(); j++){

            tSet.put(t.substring(j, j + 1), tSet.get(t.substring(j, j + 1)));
            
       }

       return sSet.equals(tSet);

    //    for (letters.Entry<String, Integer> entry : letters.entrySet()) {
    //         String key = entry.getKey();
    //         int value = entry.getValue();
    //         if ()
    //     }

    

    }
}
