class Solution {
    public int trap(int[] height) {
        int l_wall = 0;
        int r_wall = 0;
        int n = height.length;
        int sum = 0;

        int[] l_max = new int[n];
        for(int i = 0; i < n; i++)
        {
            l_max[i] = l_wall;
            l_wall = Math.max(l_wall, height[i]);
        }
        
        int[] r_max = new int[n];

        for(int i = n-1; i>= 0; i--)
        {
            r_max[i] = r_wall;
            r_wall = Math.max(r_wall, height[i]);
        }

        for(int i = 0; i < n; i++)
        {
            int current_min = Math.min(l_max[i], r_max[i]);
            int current_water = current_min - height[i];
            if(current_water > 0)
                sum += current_water;
        }

        return sum;
    }
}
