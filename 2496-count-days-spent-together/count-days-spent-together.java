class Solution {
    private int getDays(String date) {
        int days[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int month = Integer.parseInt(date.substring(0,2));
        int day = Integer.parseInt(date.substring(3,5));
        int total = day;
        for(int i = 0; i < month - 1; i++) {
            total += days[i];
        }
        return total;
    }
    public int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob) {
        int a_start = getDays(arriveAlice);
        int a_end = getDays(leaveAlice);
        int b_start = getDays(arriveBob);
        int b_end = getDays(leaveBob);
        int start = Math.max(a_start, b_start);
        int end = Math.min(a_end, b_end);

        if(start > end) return 0;
        return end - start + 1;
    }
}