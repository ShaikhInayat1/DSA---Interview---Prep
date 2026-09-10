class Solution {
    public List<Integer> findAnagrams(String s, String p) {

        List<Integer> list = new ArrayList<>();

        int k = p.length();

        int[] pCount = new int[26];
        int[] sCount = new int[26];

        // Count characters of p
        for (char ch : p.toCharArray()) {
            pCount[ch - 'a']++;
        }

        // Fixed Sliding Window
        for (int i = 0; i < s.length(); i++) {

            // 1. Add
            sCount[s.charAt(i) - 'a']++;

            // 2. Remove
            if (i >= k) {
                sCount[s.charAt(i - k) - 'a']--;
            }

            // 3. Check
            if (i >= k - 1) {

                if (Arrays.equals(pCount, sCount)) {
                    list.add(i - k + 1);
                }
            }
        }

        return list;
    }
}