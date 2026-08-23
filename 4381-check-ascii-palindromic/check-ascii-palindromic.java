class Solution {
    public boolean isPalindromic(String s) {
        StringBuilder binary = new StringBuilder();

        for(char ch : s.toCharArray()) {

            String b = Integer.toBinaryString(ch);

            while(b.length() < 8) {
                b = "0" + b;
            }

            binary.append(b);
        }

        int l = 0;
        int r = binary.length() - 1;

        while(l <= r) {

            if(binary.charAt(l) != binary.charAt(r)) {
                return false;
            }

            l++;
            r--;
        }

        return true;
    }
}