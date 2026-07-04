class Solution {
    public int firstUniqChar(String s) {
        
        int[] result = new int[26];

        for(char ch : s.toCharArray()){

            result[ch - 'a']++;
        }

        for(int i = 0; i < s.length(); i++){

            if(result[s.charAt(i) - 'a'] == 1){

                    return i;
            }
        }
            return -1;
    }
}