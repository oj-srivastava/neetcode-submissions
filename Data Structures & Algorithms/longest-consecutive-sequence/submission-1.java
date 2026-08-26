class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        int max = 0;
        for(int num:set){
            if(set.contains(num-1)){
                continue;
            }
            else{
                int chain = 1;
                int curr = num;
                while(set.contains(curr+1)){
                    curr = curr+1;
                    chain = chain+1;
                }
                if(chain>max){
                    max=chain;
                }
            }
        }
        return max;
    }
}
