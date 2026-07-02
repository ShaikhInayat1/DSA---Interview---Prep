class Solution {
    public String compressedString(String word) {
        
        StringBuilder sb = new StringBuilder();

        int n = word.length();

        int i = 0;
        int index = 0;

        while(i < n){

            char curr_Char = word.charAt(i);
            int count = 0;

            while(i < n && word.charAt(i) == curr_Char){

                count++;
                i++;
            }

            while(count > 0){

                int t = Math.min(9, count);

                sb.append(t);
                sb.append(curr_Char);

                count -= t;
            }
        }
                return sb.toString();
    }
}