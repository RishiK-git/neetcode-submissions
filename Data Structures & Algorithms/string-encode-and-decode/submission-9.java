//package main.java.com.mycompany.wardrobeorganizer.test;

// import java.util.ArrayList;
// import java.util.List;

public class Solution {

    // public static void main(String[] args) {
    //     Solution s = new Solution();
    //     List l = new ArrayList<>();
    //     l.add("neet");
    //     l.add("code");
    //     l.add("love");
    //     l.add("you");

        
    //     System.out.println(s.encode(l));
        
    // }
    //4,4,4,3,#neetcodeloveyou
    
    public String encode(List<String> strs) {
        if (strs.isEmpty()) return "";
        
        StringBuilder res = new StringBuilder();
        //res.append('#');
        for (String str : strs) {
            res.append(str).append(",");
        }
        return res.toString();
    }

    public List<String> decode(String str) {
        List<String> res = new ArrayList<>();
        System.out.println("String lenght:" + str);
        if (str.length() == 0) {
            res.add("")
            return res;
        }

        if (str.equals(",")) {
            return res;
        }

        
        String[] streingSplitArray = str.split(",");
        for (int i = 0; i < streingSplitArray.length; i++) {
            res.add(streingSplitArray[i]);
        }

        return res;
    }
}