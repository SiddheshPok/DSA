class Solution {
    public String longestCommonPrefix(String[] strs) {
        String pref = strs[0];
        for(int i = 0; i < pref.length(); i++){
            char ch = pref.charAt(i);
            for(int j = 1; j < strs.length; j++){
                if(i >= strs[j].length() || ch != strs[j].charAt(i)){
                    return pref.substring(0,i);
                }
            }
        }
        return pref;
    }
}