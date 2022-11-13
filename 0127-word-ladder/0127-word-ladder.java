

class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        Set<String> set = new HashSet<>(wordList);

        if(!set.contains(endWord)){
            return 0;
        }
        
        set.remove(beginWord);
        
        Queue<String> q = new LinkedList<>();
        q.offer(beginWord);
        
        int ans = 1;
        
        while(!q.isEmpty()){
            // System.out.println(q);
            int size = q.size();
            for(int t = 0 ; t < size ; ++t){    
            String s = q.poll();
            
            if(s.equals(endWord)){
                return ans;
            }
            
            for(int i = 0 ; i < s.length() ; ++i){
                char tempp[] = s.toCharArray();
                for(char j = 'a'; j <= 'z'; ++j){
                    tempp[i] = j;
                      String tocompare = new String(tempp);
                    if(set.contains(tocompare)){
                        // System.out.println(tocompare +"," + i + "," + j);
                        q.offer(tocompare);    
                        set.remove(tocompare);
                    }
                }
            }  
        }
                ++ans;
        }
        return 0;
    }
}