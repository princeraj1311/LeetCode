class Solution {
    public int minPairSum(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int sum =0;
        for(int i = 0 ; i < n/2 ; i++){
            int currentsum = nums[i] + nums[n-1-i];
            sum = Math.max(sum ,currentsum);
            }
        return sum;
    }
}