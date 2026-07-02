class Solution {
    public int compress(char[] chars) {

       int n = chars.length;

       int index = 0;
       int i = 0;

       while(i < n){

        char curr_Char = chars[i];
        int count = 0;

        while(i < n && chars[i] == curr_Char){

            count ++;
            i++;
        }

            chars[index] = curr_Char;
            index++;

            if(count > 1){

                String freq = String.valueOf(count);

                for(char c : freq.toCharArray()){

                    chars[index] = c;
                    index++;
                }
            }
       } 
                return index;
    }
}