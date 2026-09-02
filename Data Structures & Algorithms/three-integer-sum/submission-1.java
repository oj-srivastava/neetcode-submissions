class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length-2;i++){
            int target = -nums[i];
            int l=i+1;
            int r=nums.length -1;
            while(l<r){
                if((nums[l]+nums[r]) == target){
                    ans.add(Arrays.asList(nums[i], nums[l], nums[r]));
                    l++;
                } else if ((nums[l]+nums[r]) > target){
                    r--;
                } else {
                    l++;
                }
            }
        }
        List<List<Integer>> op = new ArrayList<>(new HashSet<>(ans));
        return op;
        
    }
}
