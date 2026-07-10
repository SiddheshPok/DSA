class Solution {
    public int totalMoney(int n) {

        int start = 1;
        int today = start;
        int day = 0;
        int sum = 0;
        int i = 0;

        while (i < n)
        {
            sum += today;
            today++;
            day++;
            i++;

            if (day == 7) 
            {
                start++;
                today = start;
                day = 0;
            }
        }
        return sum;
    }
}