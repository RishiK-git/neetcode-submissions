class Solution {
    public boolean isValid(String s) {
        
        Stack<Character> stackOne = new Stack<>();
        Stack<Character> stackTwo = new Stack<>();
        Stack<Character> stackThree = new Stack<>();

        if (s.isEmpty()) return true;

        for (int i = 0; i < s.length(); i++) {
            stackOne.push(s.charAt(i));
        }

        while (!stackOne.isEmpty()) {

            char top = stackOne.pop();

            if (top == '(' || top == '[' || top == '{') {
                return false; // opening bracket at the end means invalid
            }

            if (top == ')' || top == ']' || top == '}') {
                stackThree.push(top);

                char match = (top == ')') ? '(' :
                             (top == ']') ? '[' : '{';

                if (stackOne.search(match) > -1) {
                    while (!stackOne.isEmpty()) {
                        char temp = stackOne.pop();
                        if (temp == match) {
                            stackThree.push(temp);
                            while (!stackTwo.isEmpty()) {
                                stackOne.push(stackTwo.pop());
                            }
                            break;
                        } else {
                            stackTwo.push(temp);
                        }
                    }
                } else {
                    return false;
                }
            } else {
                return false; // invalid character
            }
        }

        return stackOne.isEmpty();
    }
}
