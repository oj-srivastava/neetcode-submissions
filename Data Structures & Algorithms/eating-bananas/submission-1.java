class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int start=1;
        int end = 0;
        for (int pile : piles) {
            end = Math.max(end, pile);
        }
        int pivot = 1;
        while(start<=end){
            pivot = start + (end-start)/2;
            long hours = 0;
            for(int pile : piles){
                hours += (pile + pivot - 1) / pivot;
            }
            if(hours>h){
                start = pivot+1;
            } else {
                end = pivot-1;
            }
        }
        return start;
    }
}
