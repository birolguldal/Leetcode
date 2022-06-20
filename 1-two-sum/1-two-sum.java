class Solution {
    public int[] twoSum(int[] nums, int target) {

        HashMap<Integer,Integer> numberLookup = new HashMap<>();
        
        for(int i = 0; i < nums.length; i++) {
            int delta = target - nums[i]; 
            if(numberLookup.containsKey(delta)) {
                return new int[] {i,numberLookup.get(delta)};
            }
            numberLookup.put(nums[i], i);
        }
        
        throw new IllegalArgumentException("connot find");
    }
    
}