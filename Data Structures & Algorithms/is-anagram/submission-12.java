class Solution {
    public boolean isAnagram(String s, String t) {

        if(s.length() != t.length()){

            return false;
        }

       TreeSet<String> sSet = new TreeMap<String>();
       TreeSet<String> tSet = new TreeMap<String>();


       for(int i = 0; i < s.length(); i++){

            sSet.add(s.substring(i, i + 1));
            
       }
       for(int j = 0; j < t.length(); j++){

            tSet.add(t.substring(j, j + 1));
            
       }

       return sSet.equals(tSet);

    //    for (letters.Entry<String, Integer> entry : letters.entrySet()) {
    //         String key = entry.getKey();
    //         int value = entry.getValue();
    //         if ()
    //     }

    

    }
}
