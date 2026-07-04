class Solution {
    public int mostWordsFound(String[] sentences) {
        int n = sentences.length;
        int count = 0;
        for(int i = 0; i < n; i++)
        {
            String sb[] = sentences[i].split(" ");
            count = Math.max(count,sb.length);
        }
        // for(String sen : sentences)
        // {
        //     String sb[] = sen.split(" ");
        //     count = Math.max(count,sb.length);
        // }
        return count;
    }
}