class Solution {
    public int maxProduct(int[] nums) {
        
        int max = nums[0];
        int n = nums.length;
        
        for(int i = 0; i < n; i++) {
            int product = 1;
        for(int j = i; j< n; j++) {
            product *= nums[j];
             max = Math.max(max, product);
            }
        }
        
        
        return max;
    }
}