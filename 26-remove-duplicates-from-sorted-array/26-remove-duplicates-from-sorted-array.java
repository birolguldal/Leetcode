class Solution {
    public int removeDuplicates(int[] nums) {
        
        int i = 0;   //slow pointer
        
        for(int j = 0; j < nums.length; j++) {   //fast pointer 
            if(nums[i] != nums[j]) {
                i++;
                nums[i] = nums[j];
                
            }
        }
        
        return i + 1;     
    }
}