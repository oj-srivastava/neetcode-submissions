class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        Stack<Double> target_time_stack = new Stack<>();
        int[][] cars = new int[position.length][2];
        for (int i = 0; i < position.length; i++) {
            cars[i][0] = position[i];
            cars[i][1] = speed[i];
        }
        Arrays.sort(cars, (a,b)->Integer.compare(b[0],a[0]));

        for(int[] i : cars){
            target_time_stack.push((double)(target-i[0])/i[1]);
            if(target_time_stack.size()>=2 &&target_time_stack.peek()<=target_time_stack.get(target_time_stack.size()-2)){
                target_time_stack.pop();
            }
        }
        return target_time_stack.size();
    }
}
