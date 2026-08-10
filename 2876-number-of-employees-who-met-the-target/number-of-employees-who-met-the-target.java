class Solution {
    public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        int c = 0;
        for(int n : hours)
        {
            if(n >= target)
            {
                c++;
            }
        }
        return c;
    }
}