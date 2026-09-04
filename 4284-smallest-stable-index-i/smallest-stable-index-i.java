class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int max = 0;
        int min = Integer.MAX_VALUE;
        int[] result = new int[nums.length];
        for(int i = nums.length-1 ; i>=0 ; i--){
            min = Math.min(min , nums[i]);
            result[i] = min;
        }
        for(int i =0 ; i < nums.length; i++){
            max = Math.max(max , nums[i]);
            int stable = max - result[i];
            if (stable<=k)
                return i;
            
        }
        return -1;
    }
}