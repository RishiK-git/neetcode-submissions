class Solution {
    public boolean isPalindrome(String s) {
        
        if(s.length() == 0 || s.length() == 1) return true;

        int startPointer = 0;
        int endPointer = s.length() - 1;

        while(startPointer < endPointer){
            
            if(!Character.isLetterOrDigit(s.charAt(startPointer))){

                startPointer++;
                continue;
            }
            if(!Character.isLetterOrDigit(s.charAt(endPointer))){

                endPointer--;
                continue;
            }


            System.out.println(startPointer + " - " +s.charAt(startPointer) + " : " + endPointer + " - " + s.charAt(endPointer));
            if(Character.toLowerCase(s.charAt(startPointer)) != Character.toLowerCase(s.charAt(endPointer))) return false;

            startPointer++;
            endPointer--;
        }

        return true;
        
        
    }
}
