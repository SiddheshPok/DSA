class Solution {
    public boolean isDivisible(String str, String pattern) 
    {
        int len = pattern.length();
        if (str.length() % len != 0)
        {
            return false;
        }
        StringBuilder sb = new StringBuilder();
        int times = str.length() / len;
        for (int i = 0; i < times; i++) 
        {
            sb.append(pattern);
        }
        return sb.toString().equals(str);
    }

    public String gcdOfStrings(String str1, String str2) 
    {
        int min = Math.min(str1.length(), str2.length());
        for (int len = min; len >= 1; len--) 
        {
            String candidate = str1.substring(0, len);
            if (isDivisible(str1, candidate) && isDivisible(str2, candidate)) 
            {
                return candidate;
            }
        }

        return "";
    }
}