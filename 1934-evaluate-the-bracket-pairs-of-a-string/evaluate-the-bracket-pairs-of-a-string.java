class Solution {
    public String evaluate(String s, List<List<String>> knowledge) {
        HashMap<String,String> map = new HashMap<>();
        for(List<String> pair : knowledge) {
            map.put(pair.get(0), pair.get(1));
        }

        StringBuilder sb = new StringBuilder();
        int i = 0;
        while(i < s.length()) {
            if(Character.isLetter(s.charAt(i))) {
                sb.append(s.charAt(i));
            }
            else {
                i++;
                String check = "";
                while(s.charAt(i) != ')') {
                    check += s.charAt(i);
                    i++;
                }
                sb.append(map.containsKey(check) ? map.get(check) : '?');
            }
            i++;
        }
        
        return sb.toString();

    }
}