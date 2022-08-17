class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        
        Queue<Integer> q = new LinkedList<>();
        HashSet<Integer> h = new HashSet<>();
        
        q.add(0);
        
        while(!q.isEmpty()) {
        int currentIndex = q.poll();
            
            
            if(h.add(currentIndex)) {
                
                
            for(int i = currentIndex; i <= s.length(); i++) {
                    if(wordDict.contains(s.substring(currentIndex, i))) {
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