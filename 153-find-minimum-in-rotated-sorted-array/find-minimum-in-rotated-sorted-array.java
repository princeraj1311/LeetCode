class Solution {
    public int findMin(int[] nums) {
        int lo = 0 , hi = nums.length-1 , min=Integer.MAX_VALUE;
        if(nums.length == 1){
            return nums[0];
        }
        while(lo <= hi){
            int mid = (lo + hi)/2;
            if(nums[mid] >= nums[lo]){
                min = Math.min(min , nums[lo]);
                lo = mid +1;
            }
            else{
                min = Math.min(min , nums[mid]);
                hi = mid -1;
            }  
        }
        return min;
    }
}