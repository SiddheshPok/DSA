class Solution {
    public String defangIPaddr(String address) {
        String s[] =  address.split("\\.");
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < s.length; i++)
        {
            sb.append(s[i]);
            if(i != s.length - 1)
            {
                sb.append("[.]");
            }
        }
        return sb.toString();
    }
}