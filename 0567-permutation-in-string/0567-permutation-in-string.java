class Solution {
    public boolean checkInclusion(String s1, String s2) {
        

        int m = s2.length();
        int n = s1.length();

        int[] sCount = new int[26];
        int[] pCount = new int[26];

        if(m < n){

            return false;
        }

        for(int i = 0; i < n; i++){

            sCount[s2.charAt(i) - 'a']++;
            pCount[s1.charAt(i) - 'a']++;
        }

        if(Arrays.equals(sCount, pCount)){

            return true;
        }

        for(int i = 1; i <= m - n; i++){

            sCount[s2.charAt(i - 1) - 'a']--;
            sCount[s2.charAt(i + n - 1) - 'a']++;

            if(Arrays.equals(sCount, pCount)){

                return true;
            }
        }
            return false;
    }
}