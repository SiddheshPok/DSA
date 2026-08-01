class Solution {
    
    public int compress(char[] chars) {
        if(chars.length == 0) return 0;
        StringBuilder sb = new StringBuilder();
        int n = chars.length;
        int i = 0;
        int j = 0;
        int count = 0;
        char prevChar = chars[i];
        while(i < n){
            if(count == 0){
                count++;
                prevChar = chars[i];
                i++;
            }else if(prevChar == chars[i] ){
                count++;
                i++;
            }
            else{
                sb.append(prevChar);
                chars[j] = prevChar;
                j++;
                if(count > 1){
                    String c = String.valueOf(count);
                    int k = 0;
                    while(k < c.length() && count > 1)
                    {
                        chars[j] = c.charAt(k);
                        j++;
                        k++;
                    }
                    sb.append(count);
                    // chars[j] = (char)(count + '0') ;
                    // j++;
                }
                count = 0;
            }
        }
        chars[j] = prevChar;
        j++;
        sb.append(prevChar);
        if (count > 1) {
            String cc = String.valueOf(count);

            for (int k = 0; k < cc.length(); k++) 
            {
                chars[j++] = cc.charAt(k);
            }

            sb.append(count);
        }
        return sb.length();
    }
}