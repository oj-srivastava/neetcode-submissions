class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<int[]> bars = new Stack<>();
        int maxarea = 0;
        for(int i=0;i<heights.length;i++){
            int length = i;
            while(!bars.isEmpty() && bars.peek()[0]>heights[i]){
                int[] prev = bars.pop();
                int area = prev[0] * (i-prev[1]);
                maxarea = Math.max(area, maxarea);
                length=prev[1];
            }
            int[] bar = {heights[i],length};
            bars.push(bar);
        }
        while(!bars.isEmpty()){
            int[] prev = bars.pop();
            int area = prev[0] * (heights.length-prev[1]);
            maxarea = Math.max(area, maxarea);
        }
        return maxarea;
    }
}
