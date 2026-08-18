class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        int j = 0;
        for ( int i=0; i< s.length(); i++){
            if (!Character.isLetterOrDigit(s.charAt(i))){
                continue;
            }
            if(!Character.isLetterOrDigit(s.charAt(s.length() - 1 - j))) {
                j=j+1;
                i=i-1;
                continue;
            } 
            if(i >= (s.length() - 1 - j)){
                break;
            }
            if(s.charAt(i) == s.charAt(s.length() - 1 - j)) {
                j=j+1;
                continue;
            } else {
                return false;
            }
        }
        return true;
    }
}
