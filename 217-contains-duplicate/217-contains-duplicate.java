class Solution {
    public boolean containsDuplicate(int[] nums) {
        
        HashSet<Integer> hs = new HashSet<>();
        
        if(nums == null) {
            return false;
        }
       
        for(int i = 0; i < nums.length; i++) {
            if(hs.contains(nums[i])) {
                return true;
            } else {
                hs.add(nums[i]);
            }
        }
        
        return false;
        
    }
}