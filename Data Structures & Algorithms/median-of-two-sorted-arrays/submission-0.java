class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
          int m = nums1.length, n = nums2.length, s,b;
          int[] smaller, bigger;
          if(m<=n){
            s=m;b=n;
            smaller = nums1;
            bigger = nums2;
          } else {
            s=n;b=m;
            smaller = nums2;
            bigger = nums1;
          }

          // smaller array size s 
          // bigger array size b
          // finding left half
          int start = 0, end = s;
          while(start<=end){
            int i = start + (end-start)/2;
            int j = ((s+b+1)/2) - i; 
            int l1=i>0 ? smaller[i-1] : Integer.MIN_VALUE, l2 = j>0 ? bigger[j-1] : Integer.MIN_VALUE;
            int r1 = i<s ? smaller[i] : Integer.MAX_VALUE;
            int r2 = j<b ? bigger[j]: Integer.MAX_VALUE;

            if(l1<=r2 && l2<=r1){
                // valid partition
                if((s+b)%2 == 0){
                    // left half size will be s+b/2
                    // median will be one from left half plus one from right half by 2
                    return ((double) Math.max(l1,l2)+Math.min(r1,r2))/2;
                } else {
                    // left half size will be s+b/2
                    // median will be first from right half.
                    return Math.max(l1,l2);
                }
            } else if(l1>r2){
                end=i-1;
            } else if(l2>r1){
                start=i+1;
            }
          }
          return 0;
    }
}
