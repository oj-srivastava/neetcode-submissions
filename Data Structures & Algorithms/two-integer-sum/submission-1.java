class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> pairing = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(pairing.containsKey(nums[i])){
                int[] result = {pairing.get(nums[i]), i};
                return result;
            } else {
                pairing.put(target-nums[i],i);
            }
        }
        return new int[2];
    }
}
