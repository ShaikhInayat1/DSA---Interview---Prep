class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        
        int n = arr.length;
        int window = 0;
        int count = 0;

        for(int i = 0; i < k; i++){

            window += arr[i];
        }

        int target = k * threshold;
        
        if(window >= target){

            count++;
        }

        for(int i = 1; i <= n - k; i++){

            window = window - arr[i - 1] + arr[i + k - 1];

            if(window >= target){

                count++;
            }
        }   
            return count;
    }
}