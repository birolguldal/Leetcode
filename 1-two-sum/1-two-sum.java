class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        
        HashMap<Integer, Integer> hm = new HashMap<>();
        
        for(int i = 0; i < nums.length; i++) {
            int delta = target - nums[i];  
            if(hm.containsKey(delta)) {
                return new int[] {i, hm.get(delta)};     
            } else {
                hm.put(nums[i], i);
            }
               }
        
        return new int[] {0,0};
    }
}
               
               
