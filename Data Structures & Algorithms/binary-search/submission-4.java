class Solution {
    public int search(int[] nums, int target) {
        int start=0, end=nums.length-1, result = -1;
        while(start<=end){
            int pivot=start + ((end-start)/2);
            if(nums[pivot]==target){
                return pivot;
            } else if(nums[pivot]>target){
                end=pivot-1;
                continue;
            } else if(nums[pivot]<target){
                start=pivot+1;
                continue;
            }
        }
        return result;
    }
}
