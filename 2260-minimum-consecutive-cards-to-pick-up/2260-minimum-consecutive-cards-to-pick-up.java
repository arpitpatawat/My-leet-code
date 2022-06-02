class Solution {
    public int minimumCardPickup(int[] cards) {
       HashMap<Integer, Integer> map = new HashMap<>();
        int res = Integer.MAX_VALUE;
        for(int i = 0 ; i < cards.length ; ++i){
            if(map.containsKey(cards[i])){
                res = Math.min(res ,i + 1- map.get(cards[i]));
            }
                map.put(cards[i] , i);
        }
        return (res <= cards.length)? res:-1;
    }
}