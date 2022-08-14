class Solution {
    public boolean isAnagram(String s, String t) {
        
        if(s.length() != t.length()) {
            return false;
        }
        
        HashMap<Character, Integer> hs = new HashMap<Character, Integer>();
    
        for(int i = 0; i < s.length(); i++) {
              hs.put(s.charAt(i), hs.getOrDefault(s.charAt(i), 0) + 1);
              hs.put(t.charAt(i), hs.getOrDefault(t.charAt(i), 0) - 1);
        }
            
            for(Integer count : hs.values()) {
                if(count != 0) {
                    return false;
                } 
                
                }
        
         return true; 
           
            }
           
        }
        
    