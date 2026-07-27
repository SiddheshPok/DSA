class Solution {
    public String addStrings(String num1, String num2) {
        // int n1 = num1.length() - 1;
        // int n2 = num2.length() - 1;
        // int carry = 0;
        // String result = "";
        
        // while(n1 >= 0 || n2 >= 0 || carry != 0)
        // {
        //     int sum = carry;
        //     if(n1 >= 0)
        //     {
        //         sum += num1.charAt(n1)-'0';
        //         n1--;
        //     }
        //     if(n2 >= 0)
        //     {
        //         sum += num2.charAt(n2)-'0';
        //         n2--;
        //     }

        //     carry = sum / 10;
        //     result = (sum % 10) + result;
        // }
        // return result;

        int i = num1.length() - 1;
        int j = num2.length() - 1;
        int carry = 0;

        StringBuilder sb = new StringBuilder();

        while (i >= 0 || j >= 0 || carry != 0) {

            int sum = carry;

            if (i >= 0) sum += num1.charAt(i--) - '0';
            if (j >= 0) sum += num2.charAt(j--) - '0';

            sb.append(sum % 10);
            carry = sum / 10;
        }

        return sb.reverse().toString();
    }
}