class Solution {
    public int trap(int[] height) {
        int water = 0;
        int innerwall=0;
        int l=0,r=1,w=0;

        while(r<height.length){
            if(height[l]<=height[r]){
                water=water+(Math.min(height[r],height[l])*w)-innerwall;
                l=r;r=l+1;w=0;
                innerwall=0;
                continue;
            } else {
                innerwall=height[r]+innerwall;
                r++;w++;
                continue;
            }
        }
        r=height.length-1;
        int explored=l;
        innerwall=0;w=0;l=r-1;
        while(l>=explored){
            if(height[r]<=height[l]){
                water=water+(Math.min(height[l],height[r])*w)-innerwall;
                r=l;l=r-1;w=0;innerwall=0;
                continue;
            } else {
                innerwall=height[l]+innerwall;
                l--;w++;
                continue;
            }
        }
        
        return water;
    }
}
