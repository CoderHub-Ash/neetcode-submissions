class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet();

        for(int num: nums)
        {
            set.add(num);
        }

        int longest_seq = 0;

        for(int i = 0; i < nums.length; i++)
        {
            int current_num = nums[i];
            int current_seq = 1;

            if(!set.contains(current_num-1))
            {
                while(set.contains(current_num + 1))
                {
                    current_num += 1;
                    current_seq += 1;
                }

                longest_seq = Math.max(longest_seq, current_seq);
            }
        }

        return longest_seq;
    }
}
