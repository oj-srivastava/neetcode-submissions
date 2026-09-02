class Solution {
    public boolean checkInclusion(String s1, String s2) {
        Map<Character, Integer> c1 = new HashMap<>();
        Map<Character, Integer> win = new HashMap<>();
        if(s1.length()>s2.length()){
            return false;
        }
        for(char c : s1.toCharArray()){
            c1.put(c, c1.getOrDefault(c, 0) + 1);
        }
        for(int i=0;i<s1.length()-1;i++){
            char c = s2.charAt(i);
            win.put(c, win.getOrDefault(c, 0) + 1);
        }
        int l=0,r=s1.length()-1;
        while(r<s2.length()){
            char rc = s2.charAt(r);
            win.put(rc, win.getOrDefault(rc, 0) + 1);
            boolean res = true;
            for(Map.Entry<Character, Integer> entry : c1.entrySet()){
                if(win.containsKey(entry.getKey()) && win.get(entry.getKey()) >= entry.getValue()){
                    continue;
                } else {
                    res = false;
                    break;
                }
            }
            if(res) {return true;}
            char lc = s2.charAt(l);
            win.put(lc, win.get(lc) -1);
            l++;r++;
        }
        return false;
    }
}
