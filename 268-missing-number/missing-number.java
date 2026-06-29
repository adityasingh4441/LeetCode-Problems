class Solution {
    public int missingNumber(int[] nums) {
        int ans = 0;
        int n = nums.length;
        Arrays.sort(nums);
        int sum = 0;
        for(int i = 0; i <= n; i++){
            sum += i;
        }

        for(int i = 0; i < n; i++){
            sum -= nums[i];
            
        }
        return sum;
    }
}