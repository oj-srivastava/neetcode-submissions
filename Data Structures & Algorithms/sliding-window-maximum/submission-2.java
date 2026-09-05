class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int[] maxpos= new int[nums.length-k+1];
        int[] maxindex = new int[nums.length-k+1];
        int l=0,r=k;
        while(r-1<nums.length){
            maxpos[l] = Integer.MIN_VALUE;
            if(l>0&&maxpos[l-1]>nums[r-1]&&maxindex[l-1]!=l-1){
                maxpos[l]=maxpos[l-1];
                maxindex[l]=maxindex[l-1];
            } else {
                for(int i=l;i<r;i++){
                    if(nums[i]>maxpos[l]){
                        maxpos[l]=nums[i];
                        maxindex[l] = i;
                    }
                }
            }
            
            r++;l++;
        }
        return maxpos;
    }
}
