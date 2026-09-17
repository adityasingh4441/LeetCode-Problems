class Solution {
    public int maxSubArray(int[] nums) {
        int maxi = Integer.MIN_VALUE;
        int prefix = 0;
        for(int i = 0; i < nums.length; i++){
            if(prefix < 0) prefix = 0;
            prefix += nums[i];
            maxi = Math.max(maxi, prefix);
        }
        return maxi;
    }
}