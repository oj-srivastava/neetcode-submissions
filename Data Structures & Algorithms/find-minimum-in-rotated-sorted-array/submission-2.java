class Solution {
    public int findMin(int[] nums) {
        int start=0,end=nums.length-1, right=nums.length-1;
        int min=Integer.MAX_VALUE;
        if(start==end){
            return nums[start];
        }
        while(start<=end){
            int mid = start+(end-start)/2;
            if(nums[mid]<=min){
                min=nums[mid];
            } 
            if(nums[mid]>nums[right]){
                start=mid+1;
            } else {
                end=mid-1;
            }
        }
        return min;
    }
}