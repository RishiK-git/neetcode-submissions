class Solution {
    public boolean isAnagram(String s, String t) {


        String[] f = s.split("");
        String[] g = t.split("");

        HashMap<String, Integer> ss = new HashMap<String, Integer>();
        HashMap<String, Integer> tt = new HashMap<String, Integer>();
        
        for(String h : f){
            if(ss.containsKey(h)){

                ss.put(h, ss.get(h) + 1);
            }
            else{

                ss.put(h , 1);
            }

        }
        for(String d : g){
            if(tt.containsKey(d)){

                tt.put(d, tt.get(d) + 1);
            }
            else{

                tt.put(d , 1);
            }

        }

        for (String key : ss.keySet()) {
            
           // System.out.println(ss.get(key) + "->" + tt.get(key));

            if(ss.get(key) != tt.get(key)){
                
                return false;
            }

        }

        System.out.println("ss: " + ss);
        System.out.println("tt: " + tt);
        return true;


    }
}
