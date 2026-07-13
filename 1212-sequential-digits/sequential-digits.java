class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        List<Integer> list = new ArrayList<>();
        String s = "123456789";
        for(int len = 2; len <= 9; len++)
        {
            for(int i = 0; i + len <= 9; i++) 
            {
                String s1 = s.substring(i, i + len);
                int digit = Integer.parseInt(s1);
                if(low <= digit && digit <= high)
                {
                    list.add(digit);
                }
            }
        }
        return list;
    }
}