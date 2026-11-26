class Solution {
    public boolean canAliceWin(int n) {
        int need = 10;
        int tarn = 1;
        while(need <= n) {
            n -= need;
            tarn = 1 - tarn;
            need--;
        }
        return tarn == 0;
    }
}