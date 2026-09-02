class Solution {

    public String encode(List<String> strs) {
        StringBuilder op = new StringBuilder();
        for(String str : strs){
            if(str.equals("")){
                str = "#emp#";
            }
            op.append(str).append("#oj#");
        }
        return op.toString();
    }

    public List<String> decode(String str) {
        String[] parts = str.split("#oj#");
        List<String> output = new ArrayList<String>();
        for(String part: parts){
            if(part.length() == 0){
                continue;
            }
            if(part.equals("#emp#")){
                output.add("");
            } else {
                output.add(part);
            }
        }

        return output;
    }
}
