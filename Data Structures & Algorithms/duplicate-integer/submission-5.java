class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashMap<Integer, Integer> hm = new HashMap<>();

        for(int num : nums)
        {
            if(hm.containsKey(num))
                return true;
            hm.put(num, 1);
        }

        return false;
    }
}