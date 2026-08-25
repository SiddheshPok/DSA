class Solution 
{
    private boolean isPrime(int n) 
    {
        if (n <= 1) 
        {
            return false;
        }
        if (n == 2) 
        {
            return true;
        }
        if (n % 2 == 0)
        {
            return false;
        }
        
        int boundary = (int) Math.sqrt(n);
        for (int i = 3; i <= boundary; i += 2) 
        {
            if (n % i == 0) 
            {
                return false;
            }
        }
        return true;
    }
    public boolean checkPrimeFrequency(int[] nums) 
    {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++)
        {
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) 
        {
            if(isPrime(entry.getValue()))
            {
                return true;
            }
        }
        return false;
    }
}