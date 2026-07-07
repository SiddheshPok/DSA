class Solution {
    public int addDigits(int num) {
        while(num >= 10){
            int m = num % 10;
            int d = num / 10;
            num = m + d;
        }
        return num;
    }
}