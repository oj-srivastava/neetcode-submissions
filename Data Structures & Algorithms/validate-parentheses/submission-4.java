class Solution {
    public boolean isValid(String s) {
        Deque<Character> stack = new ArrayDeque<>();
        for(char c : s.toCharArray()){
            if(!stack.isEmpty()){
                char top = stack.peek();
                if(c == '}' && top=='{' ||
                c == ']' && top=='[' ||
                c == ')' && top=='('){
                    stack.pop();
                    continue;
                }
            }
            stack.push(c);
        }
        if(stack.isEmpty()){
            return true;
        } else {
            return false;
        }
        
    }
}
