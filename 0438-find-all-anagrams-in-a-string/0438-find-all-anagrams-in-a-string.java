class Solution {
    public List<Integer> findAnagrams(String s, String p) {

       List<Integer> list = new ArrayList<>();

       int m = s.length();
       int n = p.length();

       if(m < n){

            return list;
       }

       int[] sCount = new int[26];
       int[] pCount = new int[26];

       for(int i = 0; i < n; i++){

            sCount[s.charAt(i) - 'a']++;
            pCount[p.charAt(i) - 'a']++;
       }

       if(Arrays.equals(sCount, pCount)){

            list.add(0);
       }

       for(int i = 1; i <= m - n; i++){

            sCount[s.charAt(i - 1) - 'a']--;
            sCount[s.charAt(i + n - 1) - 'a']++;

            if(Arrays.equals(sCount, pCount)){

                list.add(i);
            }
       }
        return list;
    }
}