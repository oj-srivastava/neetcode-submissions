public class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> sortedAnagrams = new HashMap<>();
        for(int i=0;i<strs.length;i++){
            char[] chars = strs[i].toCharArray();
            Arrays.sort(chars);
            String sorted = new String(chars);
            if(sortedAnagrams.containsKey(sorted)){
                sortedAnagrams.get(sorted).add(strs[i]);
            } else {
                sortedAnagrams.put(sorted, new ArrayList<>(List.of(strs[i])));
            }
        }
        List<List<String>> op = new ArrayList<>(sortedAnagrams.values());
        return op;
    }
}