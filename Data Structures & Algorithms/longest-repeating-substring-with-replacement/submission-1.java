class Solution {
    public int characterReplacement(String s, int k) {
        int len = s.length();
        int max = 0;
        int freqmost = 0, l=0;
        Map<Character, Integer> charfreq = new HashMap<>();
        for(int i=0;i<len;i++){
            charfreq.put(s.charAt(i),charfreq.getOrDefault(s.charAt(i),0)+1);
            freqmost = Math.max(freqmost, charfreq.get(s.charAt(i)));
            while((i-l+1)-freqmost > k){
                charfreq.put(s.charAt(l),charfreq.get(s.charAt(l))-1);
                l++;
            }
            max=Math.max(max,i-l+1);
        }
        return max;
    }
}
