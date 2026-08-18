class Solution {
    // Method to check if s is an anagram of t
    public boolean isAnagram(String s, String t) {
        if(s==t){
            return true;
        }
        Map<Character, Integer> smap = new HashMap<>();
        for(int is=0;is<s.length();is++){
            char c = s.charAt(is);
            if(smap.containsKey(c)){
                smap.put(c, smap.get(c) + 1);
            }else{
                smap.put(c, 1);
            }
        }
        Map<Character, Integer> tmap = new HashMap<>();
        for(int is=0;is<t.length();is++){
            char c = t.charAt(is);
            if(tmap.containsKey(c)){
                tmap.put(c, tmap.get(c) + 1);
            }else{
                tmap.put(c, 1);
            }
        }

        if(smap.equals(tmap)){
            return true;
        } else{
            return false;
        }

    }
}
