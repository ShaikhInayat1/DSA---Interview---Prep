class Solution {
    public int maxProduct(int[] nums) {

     int n = nums.length;
     int ans = Integer.MIN_VALUE;

     int prefix = 1;

     for(int i = 0; i < n; i++){

        if(prefix == 0){

            prefix = 1;
        }

        prefix *= nums[i];
        ans = Math.max(ans, prefix);
     }   
     
     int suffix = 1;

     for(int i = n - 1; i >= 0; i--){

        if(suffix == 0){

            suffix = 1;
        }

        suffix *= nums[i];
        ans = Math.max(ans, suffix);
     }

        return ans;
    }
}