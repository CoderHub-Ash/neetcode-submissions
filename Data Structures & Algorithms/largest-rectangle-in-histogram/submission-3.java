class Solution {
    public int largestRectangleArea(int[] heights) {
        int n = heights.length;
        Stack<Pair<Integer, Integer>> stack = new Stack();
        int max_area = 0;
        int start = 0;
        
        for(int i = 0; i < n; i++)
        {
            int current_height = heights[i];
            start = i;
            while(!stack.isEmpty() && stack.peek().getValue() > current_height)
            {
                Pair<Integer, Integer> pair = stack.pop();
                int pre_height = pair.getValue();
                int pre_index = pair.getKey();
                max_area = Math.max(max_area, pre_height*(i - pre_index));
                start = pre_index;
            }
            stack.push(new Pair(start, current_height));
        }

        while(!stack.isEmpty())
        {
            Pair<Integer, Integer> pair = stack.pop();
            int height = pair.getValue();
            int index = pair.getKey();
            max_area = Math.max(max_area, height*(n - index));
        }

        return max_area;
    }
}
