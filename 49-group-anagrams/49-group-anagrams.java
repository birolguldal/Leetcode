class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        List<List<String>> result = new ArrayList<>();
        
        if(strs == null || strs.length == 0) {
         return result; 
        }
        
        HashMap<String, List<String>> map = new HashMap<>();
        
        for(String s : strs) {
            char arr[] = s.toCharArray();
            Arrays.sort(arr);
            String ordered = new String(arr); 
            
             if(map.containsKey(ordered)) {
            map.get(ordered).add(s);
        }
        
        else{ 
            List<String> strList = new ArrayList<>();
            strList.add(s);
            map.put(ordered, strList);
        
        }
        }
        
        
        result.addAll(map.values());
        return result;
    }
    
    
}