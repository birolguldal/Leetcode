class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        
        Arrays.sort(nums);
        
        List<List<Integer>> output = new LinkedList<>();
        
        for(int i = 0; i < nums.length - 2; i++) {
            
            int start = i + 1;
            int end = nums.length - 1;
            
            if(i == 0 || nums[i] != nums[i - 1]) {
            while(start < end) {
                int cur = nums[i] + nums[start] + nums[end];
                if(cur == 0) {
                    output.add(Arrays.asList(nums[i], nums[start], nums[end]));
                    while(start < end && nums[start] == nums[start + 1]) start++;
                    while(start < end && nums[end] == nums[end - 1]) end--;
                    start++;
                    end--;
                } else if(cur > 0) {
                    end --;
                } else {
                    start++;
               
            }
            
        }
            }
     }
        
        return output;
        
        
    }
}