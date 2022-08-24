class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        HashMap<Integer, Integer> hm = new HashMap<>();
        
        for(int i = 0; i < nums.length; i++) {
       
            int delta = target - nums[i];
            
            if(!hm.containsKey(delta)) {
                hm.put(nums[i] , i);
            } else {
                return new int[] {i, hm.get(delta)};
            }
        }
        
        return new int[]{0,0};
        
    }
}