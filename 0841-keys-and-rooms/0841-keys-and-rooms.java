class Solution {

    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        int n = rooms.size();
        boolean vis[] = new boolean[n];
        vis[0] = true;
        Stack<Integer> stk = new Stack<>();
        for (int i : rooms.get(0)) {
            stk.push(i);
            vis[i] = true;
        }
        while (!stk.isEmpty()) {
            int kamra = stk.pop();
            for (int i : rooms.get(kamra)) {
                if (!vis[i]) {
                    vis[i] = true;
                    stk.push(i);
                }
            }
        }
        System.out.println(Arrays.toString(vis));
        for (boolean i : vis) if (i == false) return false;
        return true;
    }
}
