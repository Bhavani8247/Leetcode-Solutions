

class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (char ch : s.toCharArray()) {
            // If it's an opening bracket, push the corresponding closing one
            if (ch == '(') {
                stack.push(')');
            } else if (ch == '{') {
                stack.push('}');
            } else if (ch == '[') {
                stack.push(']');
            } 
            // If it's a closing bracket, check if it matches the top of the stack
            else {
                if (stack.isEmpty() || stack.pop() != ch) {
                    return false;
                }
            }
        }

        // If stack is empty, all brackets were matched correctly
        return stack.isEmpty();
    }
}
