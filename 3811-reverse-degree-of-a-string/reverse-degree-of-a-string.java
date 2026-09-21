class Solution {
    public int reverseDegree(String s) {
        int sum = 0;
        for(int i = 1; i <= s.length(); i++) {
            int num = (int)s.charAt(i-1) ;
            int p = 123 - num;
            sum += p * i;
        }
        return sum;
    }
}