class Solution {
    public boolean containsDuplicate(int[] nums) {
        
        //return true if it shows at least twice
        
        //sort the array and check the element next to it to see if they're equal 
        // check the duplicate in a hashset
        
        Arrays.sort(nums);
        
        for(int i = 0; i < nums.length - 1; i++) {
            if(nums[i] == nums[i+1]) {
                return true;
            }
        }
        return false;
    }
}