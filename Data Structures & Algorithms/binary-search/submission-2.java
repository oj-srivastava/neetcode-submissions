class Solution {
    public int search(int[] nums, int target) {
        int from=0, to=nums.length-1;
        while(from<=to){
            int mid = from + (to-from) / 2;
            if(nums[mid]==target){
                return mid;
            } 
            if(nums[mid]>target){
                to=mid-1;
            } else {
                from = mid+1;
            }
        }
        return -1;
    }
}
