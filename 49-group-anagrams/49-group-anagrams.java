class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        List<List<String>> result = new ArrayList<>();
        
        if(strs == null || strs.length == 0) {
            return new ArrayList();
        }
        
        HashMap<String, List> map = new HashMap<>();
        
        for(String s : strs) {
            char arr[] = s.toCharArray();
            Arrays.sort(arr);
            String key = String.valueOf(arr);
            if(!map.containsKey(key)) {
                map.put(key, new ArrayList());
            }
            
            map.get(key).add(s);
        }
        
        return new ArrayList(map.values());
        
    }
}