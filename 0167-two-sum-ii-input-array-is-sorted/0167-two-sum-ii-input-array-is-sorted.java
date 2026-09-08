class Solution {
    public int[] twoSum(int[] numbers, int target) {
        
       int n = numbers.length;

       int start = 0;
       int end = n - 1;

       while(start < end){

            int compliment = numbers[start] + numbers[end];

            if(compliment < target){

                    start ++;
            }
            else if(compliment > target){

                end --;
            }

            else{

                return new int[]{start + 1, end + 1};
            }
       }
        return new int[]{};
    }
}