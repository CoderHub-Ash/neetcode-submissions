class Solution {
    public int characterReplacement(String s, int k) {
        int n = s.length();
        int window_start = 0;

        int[] char_count = new int[26];
        int max_freq = 0;
        int max_length = 0;

        for(int window_end = 0; window_end < n; window_end++)
        {
            int current_char = s.charAt(window_end) - 'A';
            char_count[current_char]++;
            max_freq = Math.max(max_freq, char_count[current_char]);

            while(window_end - window_start - max_freq + 1 > k)
            {
                char_count[s.charAt(window_start) - 'A']--;
                window_start++;
            }

            max_length = Math.max(max_length, window_end-window_start+1);
        }

        return max_length;
    }
}
