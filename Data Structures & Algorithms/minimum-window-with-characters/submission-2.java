class Solution {
    public String minWindow(String s, String t) {
        if(t.length()>s.length()){
            return "";
        }
        Map<Character, Integer> tmap = new HashMap<>();
        Map<Character, Integer> window = new HashMap<>();
        for(int i=0;i<t.length();i++){
            char tc = t.charAt(i);char sc = s.charAt(i);
            tmap.put(tc, tmap.getOrDefault(tc, 0)+1);
            window.put(sc, window.getOrDefault(sc, 0)+1);
        }
        String res = s; boolean found = false;
        int l=0,r=t.length()-1, matches = 0;
        for(Map.Entry<Character, Integer> entry : tmap.entrySet()){
            if(window.containsKey(entry.getKey()) && window.get(entry.getKey()) >= entry.getValue()){
                matches++;
            }
        }
        for(r=t.length()-1;r<s.length();r++){
            if(matches==tmap.size()){
                found=true;
                // System.out.println(l);
                // System.out.println(tmap);
                // System.out.println(window);
                while(window.get(s.charAt(l)) > tmap.getOrDefault(s.charAt(l),0) && r>l){
                    window.put(s.charAt(l),window.get(s.charAt(l))-1);
                    l++;
                }
                // System.out.println(r);
                // System.out.println(l);
                // System.out.println(res);
                // System.out.println(s.substring(l,r+1));
                // System.out.println("One round");
                if(res.length()>(r+1-l)){
                    res=s.substring(l,r+1);
                }
            }
            if(r+1<s.length()){
                window.put(s.charAt(r+1), window.getOrDefault(s.charAt(r+1),0)+1);
                if(tmap.containsKey(s.charAt(r+1)) && window.get(s.charAt(r+1)) == tmap.get(s.charAt(r+1))){
                    matches++;
                }
            }
            
        }
        return found?res:"";
        
    }
}
