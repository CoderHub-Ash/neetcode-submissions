class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        int n = position.length;
        Stack<Double> stack = new Stack();
        int[][] set = new int[n][2];

        for(int i = 0; i < n;i++)
        {
            set[i][0] = position[i];
            set[i][1] = speed[i];
        }

        Arrays.sort(set, (a,b) -> Integer.compare(b[0], a[0]));

        for(int[] pair: set)
        {
            double current_time = (double)(target-pair[0])/pair[1];
            if(!stack.isEmpty() && stack.peek() >= current_time)
                continue;
            else
                stack.push(current_time);
        }

        return stack.size();
    }
}
