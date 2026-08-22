class Solution {
    public int longestSubarray(int[] nums) {
        
        int left = 0;
        int last_zero_idx = -1;
        int result = 0;

        for(int right = 0; right < nums.length; right++){

            if(nums[right] == 0){

                left = last_zero_idx + 1;
                last_zero_idx = right;
            }

            result = Math.max(result , right - left);
        }
            return result;
    }
}