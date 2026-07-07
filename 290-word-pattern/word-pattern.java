class Solution {
    public boolean wordPattern(String pattern, String s) {

        String[] arr = s.split(" ");

        if (pattern.length() != arr.length) {
            return false;
        }

        HashMap<Character, String> map = new HashMap<>();
        HashMap<String, Character> reverse = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            char c = pattern.charAt(i);
            if (!map.containsKey(c)) {
                map.put(c, arr[i]);
            }
            if (!reverse.containsKey(arr[i])) {
                reverse.put(arr[i], c);
            }
            if (!map.get(c).equals(arr[i]) || reverse.get(arr[i]) != c) {
                return false;
            }
        }
        return true;
    }
}