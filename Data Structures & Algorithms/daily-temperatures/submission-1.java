class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;

        Stack<Integer> stack = new Stack();
        int[] result = new int[n];

        for(int current_day = 0; current_day < n; current_day++)
        {
            while(!stack.isEmpty() && temperatures[stack.peek()] < temperatures[current_day])
            {
                int previous_day = stack.pop();
                result[previous_day] = current_day - previous_day;
            }
            stack.push(current_day);
        }

        return result;
    }
}
