class Solution {
    public int lengthOfLongestSubstring(String s) {
        int i = 0;
		int j = 0;
		int max = 0;
		
		Set<Character> set = new HashSet();
		
		while(j < s.length())
		{
			while(set.contains(s.charAt(j)))
			{
				set.remove(s.charAt(i));
				i++;
			}
			set.add(s.charAt(j));
            j++;
			max = Math.max(max, set.size());
		}
		
		return max;
    }
}
