class Solution {
    public String reversePrefix(String word, char ch) {
        int right = word.indexOf(ch);
        char arr[] = word.toCharArray();
        int left = 0;
        while(left < right) {
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < arr.length; i++) {
            sb.append(arr[i]);
        }
        return sb.toString();
    }
}