class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        HashMap<Integer,Integer> hm = new HashMap<>();
        
        //add the numbers and their positions 
        
        for(int i = 0; i < nums.length; i++) {
            int delta = target - nums[i];
            if(hm.containsKey(delta)) {
                return new int[] {i, hm.get(delta)};
            }
            
            hm.put(nums[i], i);    
        }
        
        throw new IllegalArgumentException("connot find");
        
    }
}