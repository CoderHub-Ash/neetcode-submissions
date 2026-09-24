class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] result = {};
        int left = 0;
        int right = numbers.length-1;

        while(left < right)
        {
            int sum = numbers[left] + numbers[right];
            if(sum == target)
            {
                result = new int[]{left+1, right+1};
                break;
            }

            if(sum > target)
                right--;
            else
                left++;
        }

        return result;
    }
}
