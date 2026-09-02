class Solution {
    public int maxArea(int[] heights) {
        int l = 0;
        int r = heights.length - 1;
        int areamax = 0;
        while(l<r){
            int area = (r-l)*Math.min(heights[l],heights[r]);
            if(area>areamax){
                areamax=area;
            }
            if(heights[l]<heights[r]){
                l++;
            } else {
                r--;
            }
        }
        return areamax;
    }
}
