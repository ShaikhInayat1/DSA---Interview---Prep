class Solution {
    public double findMaxAverage(int[] nums, int k) {

        int n = nums.length;

        double window = 0;

        for(int i = 0; i < k; i++){

            window += nums[i];
            
        }
            double max = window;
        
        for(int i = 1; i <= n - k; i++){

            window = window - nums[i - 1] + nums[i + k - 1];

            max = Math.max(max, window);
        }
            return max / k;
    }
}