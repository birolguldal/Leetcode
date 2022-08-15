class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        
        Queue<Integer> q = new LinkedList<>();
        HashSet<Integer> hs = new HashSet<>();
        
        q.add(0);
        
        while(!q.isEmpty()) {
            int curIndex = q.poll();
            
            if(hs.add(curIndex)) {
                for(int i = curIndex; i <= s.length(); i++) {
                    
                    
                    if(wordDict.contains(s.substring(curIndex, i))) {
                        if(i == s.length()) {
                            return true;
                        }
                        q.add(i);
                    }
                }
            }
        }
        
        return false;
        
    }
}