class Solution {

    public int finalValueAfterOperations(String[] o) {
        int ans = 0;
        for (String x : o) {
            char p = x.charAt(1);
            switch (p) {
                case '+':
                    ans++;
                    break;
                case '-':
                    ans--;
                    break;
            }
        }
        return ans;
    }
}
