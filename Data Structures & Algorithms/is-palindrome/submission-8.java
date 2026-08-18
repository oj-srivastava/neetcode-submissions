class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        int j = 0;
        for ( int i=0; i< s.length(); i++){
            if(i == s.length() - 1 - j){
                    break;
            }
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
                System.out.println(s.charAt(i));
                System.out.println(s.charAt(s.length() - 1 - j));
                System.out.println(i);
                System.out.println(j);
                return false;
            }
        }
        return true;
    }
}
