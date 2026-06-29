class Solution {
    public int missingNumber(int[] nums) {
        int ans = 0;
        int n = nums.length;
        int sum = n * (n + 1)/2;
        for(int i = 0; i < n; i++){
            sum -= nums[i];
            
        }
        return sum;
    }
}