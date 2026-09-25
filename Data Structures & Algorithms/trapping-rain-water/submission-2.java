class Solution {
    public int trap(int[] height) {
        if(height == null || height.length == 0)
			return 0;
			
        int l = 0;
		int r = height.length - 1;
		
		int l_max = height[l];
		int r_max = height[r];
		
		int max_water = 0;
		
		while(l<r)
		{
			if(height[l] < height[r])
			{
				int current_water = l_max - height[l];
				if(current_water > 0)
					max_water += current_water;
				l_max = Math.max(l_max, height[l]);
				l++;
			}
			else
			{
				int current_water = r_max - height[r];
				if(current_water > 0)
					max_water += current_water;
				r_max = Math.max(r_max, height[r]);
				r--;
			}
		}
		
		return max_water;
    }
}
