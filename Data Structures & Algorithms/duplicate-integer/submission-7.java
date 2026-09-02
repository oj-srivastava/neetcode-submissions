class Solution {
    public boolean hasDuplicate(int[] nums) {
        Map<Integer, Integer> occurences = new HashMap<>();
        for(int i=0;i< nums.length;i++){
            if(!occurences.containsKey(nums[i])){
                occurences.put(nums[i], 1);
            } else{
                return true;
            }
        }
        return false;
    }
}