class Solution {
     public boolean isValid(String s) {
        char [] arr = s.toCharArray();
        Stack<Character> stack = new Stack<>();
        for(int i=0; i< arr.length; i++) {
            if (arr[i] == '(' || arr[i] == '[' || arr[i] == '{') {
                stack.push(arr[i]);
            } else if (arr[i] == ')' || arr[i] == ']' || arr[i] == '}') {
                if(stack.empty()){
                    return false;
                }
                char top = stack.pop();
                char current = arr[i];
                if((top == '(' && current == ')') || (top == '[' && current == ']') || (top == '{' && current == '}')){
                }else {
                    return false;
                }
            }
        }
        if(stack.empty()) {
            return true;
        }
        return false;
    }
}