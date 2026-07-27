class Solution {
    public int maxProduct(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        int prod1=(nums[0]-1)*(nums[1]-1);
        int prod2=(nums[n-1]-1)*(nums[n-2]-1);
        return Math.max(prod1,prod2);
    }
}