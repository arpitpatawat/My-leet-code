this question is 1 step advance of anagram. instead of checking two strings, we need to check for mutiple strings to be each others anagram so best method is to use hashMap. Now the task is to change all the anagram to 1 sorted order which makes it easy for comparison.
//https://leetcode.com/problems/group-anagrams/discuss/2103760/java-solution-using-hashmap
```class Solution {
public List<List<String>> groupAnagrams(String[] strs) {
if (strs == null || strs.length == 0) return new ArrayList<>();
Map<String, List<String>> map = new HashMap<>();
for (int i = 0; i < strs.length ; ++i) {
char[] ca = new char[26];
for (char c : strs[i].toCharArray()) ca[c - 'a']++; // a good method to sort
String keyStr = String.valueOf(ca);
if (!map.containsKey(keyStr)) map.put(keyStr, new ArrayList<>());
map.get(keyStr).add(strs[i]);
}
return new ArrayList<>(map.values());
}
}```
​