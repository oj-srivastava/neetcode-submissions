class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> counts = new HashMap<>();
        for(int num : nums){
            counts.put(num, counts.getOrDefault(num, 0) + 1);
        }
        PriorityQueue<int[]> countsOrder = new PriorityQueue<>((a,b)->Integer.compare(b[1],a[1]));
        for(Map.Entry<Integer, Integer> entry : counts.entrySet()){
            countsOrder.offer(new int[]{entry.getKey(), entry.getValue()});
        }
        int[] op = new int[k];
        for(int j=0;j<k;j++){
            op[j] =countsOrder.poll()[0];
        }
        return op;
    }
}
