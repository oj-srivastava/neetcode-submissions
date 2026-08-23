class Solution {

    public String encode(List<String> strs) {
        StringBuilder op = new StringBuilder();
        for(String str : strs){
            if(str.equals("")){
                str = "#empty#";
            }
            op.append(str).append("#ojas#");
        }
        return op.toString();
    }

    public List<String> decode(String str) {
        // if(str.equals("#ojas#")){
        //     return new ArrayList<String>(List.of(""));
        // }
        String[] parts = str.split("#ojas#");
        List<String> output = new ArrayList<String>();
        for(String part: parts){
            if(part.length() == 0){
                continue;
            }
            if(part.equals("#empty#")){
                output.add("");
            } else {
                output.add(part);
            }
        }

        return output;
    }
}
