class Solution {
    public boolean isAnagram(String s, String t) {
        
//        Approach:

// create a hashmap to store the frequency of each character
// iterate through string s, set character as key of hashmap and increment value by 1. At the same time, iterate through string t and decrement value by 1 using the character as key.
// when complete, iterate through values of hashmap and return false if any of them not equals to 0. Return true if all equals to 0
        if (s.length() != t.length()) {
            return false;
        }
        
        HashMap<Character, Integer> hashMap = new HashMap<Character, Integer>();
        for (int i = 0; i < s.length(); i++) {
            hashMap.put(s.charAt(i), hashMap.getOrDefault(s.charAt(i), 0)+1);
            hashMap.put(t.charAt(i), hashMap.getOrDefault(t.charAt(i), 0)-1);
        }
        
        for (Integer count : hashMap.values()) {
            if (count != 0) {
                return false;
            }
        }
        return true;
    }
}