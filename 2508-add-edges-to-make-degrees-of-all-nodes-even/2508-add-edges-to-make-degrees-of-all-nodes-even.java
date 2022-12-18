/* the idea is first find all number of nodes for which the degree is odd
-> since 1 edges connect 2 nodes, that means that using 2 egdes i can connect at most 4 nodes
-> 1 more point, while connecting nodes, i can't connect neightbours nodes to each other
-> since i need to know often that weather the current node is the neighbour of some other node, i prefer to use adj matrix here.
-> case 1: if the total odd nodes are greater than 4 then return false coz no possible way
-> case 2: if total odd nodes == 0 then return true;
-> case 3: if total odd nodes == 1 then return false;
-> case 4: if total odd nodes == 2 then again 2 case -
   1) either they can connect with themselves if they are not neighbours - check and return true
   2) they (say nodes A and B) can connect with someone else even node(C) such that [A - C - B] - check and return true
-> case 5: if total nodes odd are == 3 then return false;
-> case 6: if total odd nodes are 4 they can only connect if they all are distinct neighbours or pair of distinct neighbour
-> last thing: since total edges are 10^5 then using matrix will make memory LE so use set/map. 
*/
class Solution {
    public boolean isPossible(int n, List<List<Integer>> edges) {
        Map<Integer, Set<Integer>> map = new HashMap<>();
        int deg[] = new int[n+1];
        for(List<Integer> i : edges){
            int start = i.get(0);
            int end = i.get(1);
            deg[start]++;
            deg[end]++;
            if(!map.containsKey(start)){
                map.put(start , new HashSet<Integer>());
            }
            if(!map.containsKey(end)){
                map.put(end , new HashSet<Integer>());
            }
            map.get(start).add(end);
            map.get(end).add(start);
        }
        
        List<Integer> nodes = new ArrayList<>();
        for(int i = 1; i <= n; ++i){
            if(deg[i] %2 != 0) nodes.add(i);
        }
        
        switch(nodes.size()){
            case 0: {
                return true;
            }
            case 1: {
                return false;
            }    
            case 2: {
                // check if the are neighbours
                int nodeA = nodes.get(0);
                int nodeB = nodes.get(1);
                if(map.get(nodeA).contains(nodeB)){ // if they are neighbours
                    for(int i = 1; i <= n; ++i){
                        if(i == nodeA || i == nodeB || map.get(i).contains(nodeA) || map.get(i).contains(nodeB)) continue; //the third nodes should not be connected with them
                        else {
                            return true;
                        }
                    }
                }
                else{
                    return true;
                }
            }
            case 3: {
                return false;
            }
            case 4: {
                int nodeA = nodes.get(0);
                int nodeB = nodes.get(1);
                int nodeC = nodes.get(2);
                int nodeD = nodes.get(3);
                if((!map.get(nodeA).contains(nodeB) && !map.get(nodeC).contains(nodeD)) || (!map.get(nodeA).contains(nodeC) && !map.get(nodeB).contains(nodeD)) || (!map.get(nodeA).contains(nodeD) && !map.get(nodeB).contains(nodeC))) return true;
                else return false;
                
            }
            default : return false;
        }
        
       
        
    }
}