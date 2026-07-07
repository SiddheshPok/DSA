class Solution {
    public String reverseOnlyLetters(String s) {
        char ch[] = s.toCharArray();
        int start = 0;
        int end = ch.length - 1;
        while(start < end)
        {
            if(!Character.isLetter(ch[start]))
            {
                start++;
            }
            else if(!Character.isLetter(ch[end]))
            {
                end--;
            }
            else{
                char chh = ch[end];
                ch[end] = ch[start];
                ch[start] = chh;
                start++;
                end--;
            }
        }
        return new String(ch);
    }
}