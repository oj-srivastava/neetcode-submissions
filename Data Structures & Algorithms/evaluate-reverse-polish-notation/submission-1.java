class Solution {
    public int evalRPN(String[] tokens) {
        Deque<String> notations = new ArrayDeque<>();
        for(String notation : tokens){
            if(notation.equals("+") || notation.equals("-") ||
    notation.equals("*") || notation.equals("/")){
                int r = Integer.parseInt(notations.pop());
                int l = Integer.parseInt(notations.pop());
                if(notation.equals("+")){
                    notations.push((l+r)+"");
                } else if(notation.equals("-")){
                    notations.push((l-r)+"");
                } else if(notation.equals("*")){
                    notations.push((l*r)+"");
                } else if(notation.equals("/")){
                    notations.push((l/r)+"");
                }
            } else {
                notations.push(notation);
            }
        }
        return Integer.parseInt(notations.pop());
    }
}
