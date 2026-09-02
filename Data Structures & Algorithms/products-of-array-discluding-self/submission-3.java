class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] output = new int[n];
        int pi = 1;
        for(int i=0;i<n;i++){
            pi=pi*nums[i];
        }
        for(int i=0;i<n;i++){
            if(nums[i]!=0){
                output[i] = pi/nums[i];
            } else {
                int ipi = 1;
                for(int j=0;j<n;j++){
                    if(j!=i){
                        ipi=ipi*nums[j];
                    }
                }
                output[i] = ipi;
            }
        }
        return output;
    }
}  
