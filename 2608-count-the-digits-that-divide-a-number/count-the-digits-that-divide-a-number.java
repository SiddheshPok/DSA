class Solution {
    public int countDigits(int num) {
        int count = 0;
        int store = num;
        while(num != 0)
        {
            int no = num % 10;
            if(store % no == 0) count++;
            num /= 10;
        }
        return count;
    }
}