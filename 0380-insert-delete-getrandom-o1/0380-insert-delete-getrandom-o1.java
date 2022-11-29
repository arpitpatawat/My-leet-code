class RandomizedSet {
    
    /* 
    -> use arraylist to store the elements for add/remove operation
    -> use map to store index of each element present
    -> optimization => since removing a element is O(n) operation , what i will do is 
       1) swap to_remove element with last_element of the list
       2) delete last_element of the list  ( O(1))
       3) make sure to update the values of index of the last_element in the map.
    -> I will always add element at the end for arrayList, coz easy to get the index of element.
    -> use java random class for getting a random value from 0 to arr.size() i.e. all elements
       Note -> there are articles which tells that 'java.util.Random' is thread safe and more better than
               'Math.random' so i am gonna use that.
    -> Random random = new Random()  ,  int value = random.nextInt(n); => returns a random value b/w 0 to n - 1
    */
    
    List<Integer> ans;
    Map<Integer, Integer> map;
    public RandomizedSet() {
        ans = new ArrayList<>();
        map = new HashMap<>();
    }
    
    public boolean insert(int val) {
        if(map.containsKey(val)) return false;
        ans.add(val);
        map.put(val, ans.size() - 1);
        return true;
    }
    
    public boolean remove(int val) {
        if(!map.containsKey(val)) return false;
        int index = map.get(val);
        int temp = ans.get(ans.size() - 1);
        ans.set(index , temp);
        ans.set(ans.size() - 1, val);
        ans.remove(ans.size() - 1);
        map.put(temp, index);
        map.remove(val);
        return true;
    }
    
    public int getRandom() {
        Random rand = new Random();
        int size = ans.size();
        return (ans.get(rand.nextInt(size)));
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */