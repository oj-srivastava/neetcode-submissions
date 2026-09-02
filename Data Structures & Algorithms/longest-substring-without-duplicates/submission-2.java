class Solution {
    public int lengthOfLongestSubstring(String s) {
        int lenmax=0;
        
        char[] arr = s.toCharArray();
        
        for(int i=0;i<arr.length;i++){
            if((arr.length-i)<=lenmax){
                break;
            }
            Set<Character> chars = new HashSet<>();
            chars.add(arr[i]);
            int len = 1;
            for(int j=i+1;j<arr.length;j++){
                if(!chars.contains(arr[j])){
                    len++;chars.add(arr[j]);
                } else {
                    break;
                }
            }
            lenmax = Math.max(len,lenmax);
        }
        return lenmax;
    }
}
