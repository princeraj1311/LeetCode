class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int max = nums[0];
        int[] min = new int[nums.length];
        min[nums.length-1] = nums[nums.length-1];
        for(int i = nums.length-2 ; i>=0 ; i--){
            min[i] = Math.min(min[i+1] , nums[i]);
            }
        for(int i = 0 ; i<nums.length ; i++){
            max = Math.max(max , nums[i]);     
            int result = max - min[i] ;
            if(result <= k){
            return i ;
            }
        }
        return -1;
    }
}