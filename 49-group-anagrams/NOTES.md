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