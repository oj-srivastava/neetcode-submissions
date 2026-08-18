class Solution {
    public boolean isValid(String s) {
        Deque<Character> stack = new ArrayDeque<>();
        Map<Character, Character> bracketMap = Map.of('(',')','{','}','[',']');
        for(int i=0;i<s.length();i++){
            char e = s.charAt(i);
            if(e == '(' || e == '{' || e == '['){
                stack.push(e);
            } else if (e == ')' || e == '}' || e == ']'){
                if (stack.isEmpty()){
                    return false;
                }
                char top = stack.peek();
                if(e == bracketMap.get(top)){
                    stack.pop();
                } else {
                    return false;
                }
            }
        }
        if(stack.isEmpty()){
            return true;
        } else{
            return false;
        }
        
    }
}
