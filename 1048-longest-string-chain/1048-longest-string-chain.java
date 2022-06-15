// need to do again #DP
class Solution {
   public int longestStrChain(String[] words) {
	Arrays.sort(words, (String a, String b) -> a.length() - b.length()); // sort by length
	Map<String, Integer> dp = new HashMap<>();

	int maxPath = 1;
	// same idea behind the previous approach but performed iteratively.
	for (String word: words) {
		int currLength = 1;
		StringBuilder sb = new StringBuilder(word);
		for (int i=0; i<word.length(); i++) {
			sb.deleteCharAt(i);
			String prevWord = sb.toString();
			currLength = Math.max(currLength, dp.getOrDefault(prevWord, 0) + 1); 
			sb.insert(i, word.charAt(i));
		}
		dp.put(word, currLength);
		maxPath = Math.max(maxPath, currLength);
	}

	return maxPath;
}
}