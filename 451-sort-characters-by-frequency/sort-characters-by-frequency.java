class Solution {
    public String frequencySort(String s) {
        TreeMap<Character,Integer> tm = new TreeMap<>();
        for(char ch : s.toCharArray()) {
            tm.put(ch,tm.getOrDefault(ch,0)+1);
        }
        List<Map.Entry<Character, Integer>> list = new ArrayList<>(tm.entrySet());

        list.sort((a,b) -> b.getValue() - a.getValue());
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<Character, Integer> entry : list) {

            char ch = entry.getKey();
            int freq = entry.getValue();

            for (int i = 0; i < freq; i++) {
                sb.append(ch);
            }
        }
        return sb.toString();
    }
}