class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<Pair<Integer,Integer>> stack = new Stack();
        int max_area = 0;
        int start;

        for(int i = 0; i < heights.length; i++)
        {
            int curr_height = heights[i];
            start = i;

            while(!stack.isEmpty() && stack.peek().getValue() > curr_height)
            {
                Pair<Integer, Integer> previous_pair = stack.pop();
                int pre_height = previous_pair.getValue();
                int pre_index = previous_pair.getKey();
                max_area = Math.max(max_area, pre_height * (i - pre_index));
                start = pre_index;
            }
            stack.push(new Pair(start, curr_height));
        }

        while(!stack.isEmpty())
        {
            Pair<Integer, Integer> pair = stack.pop();
            int height = pair.getValue();
            int index = pair.getKey();
            max_area = Math.max(max_area, height * (heights.length - index));
        }

        return max_area;
    }
}
