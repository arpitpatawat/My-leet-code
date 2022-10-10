class Solution {

    public int finalValueAfterOperations(String[] o) {
        int ans = 0;
        for (String x : o) {
            switch (x) {
                case "++X":
                    ans++;
                    break;
                case "X++":
                    ans++;
                    break;
                case "--X":
                    ans--;
                    break;
                case "X--":
                    ans--;
                    break;
            }
        }
        return ans;
    }
}
