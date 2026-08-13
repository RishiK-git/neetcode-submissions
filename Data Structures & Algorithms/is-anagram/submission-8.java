class Solution {
    public boolean isAnagram(String s, String t) {

        if(s.length() != t.length()){return false;}

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

        if(ss.size() > tt.size() || ss.size() == tt.size()){

            for (String key : ss.keySet()) {
                    if(!tt.containsKey(key)){return false;}
                // System.out.println(ss.get(key) + "->" + tt.get(key));

                    if(!ss.get(key).equals(tt.get(key))){
                        
                        return false;
                    }

            }   

        }
        else if(ss.size() < tt.size()){

            for (String key : tt.keySet()) {

                // System.out.println(ss.get(key) + "->" + tt.get(key));
                if(!ss.containsKey(key)){return false;}
                
                if(!ss.get(key).equals(tt.get(key))){
                        
                    return false;
                }

            }   

        }

        

        System.out.println("ss: " + ss);
        System.out.println("tt: " + tt);
        return true;


    }
}
