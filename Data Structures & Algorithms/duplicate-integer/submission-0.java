class Solution {
    public boolean hasDuplicate(int[] nums) {
        Map<Integer, Integer> numsMap = new HashMap<>();
        for(int i=0; i< nums.length; i++){
            if(numsMap.containsKey(nums[i]) && numsMap.get(nums[i]) > 0){
                return true;
            } else {
                numsMap.put(nums[i], 1);
            }
        }
        return false;
    }
}