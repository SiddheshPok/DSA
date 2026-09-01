class Solution {
    public int[] plusOne(int[] digits) 
    {
        int n = digits.length;
        int one = 1;
        int carry = 0;

        for(int i = n - 1; i >= 0; i--)
        {
            int temp = digits[i] + one + carry;
            one = 0;

            if(temp == 10)
            {
                digits[i] = 0;
                carry = 1;
            }
            else
            {
                digits[i] = temp;
                carry = 0;
            }
        }
        if (carry == 1) 
        {
            int[] newRes = new int[n + 1];
            newRes[0] = 1;  
            return newRes;   
        }
        return digits;
    }
}