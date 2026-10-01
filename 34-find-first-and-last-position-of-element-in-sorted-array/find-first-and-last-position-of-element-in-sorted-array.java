class Solution {
    public int[] searchRange(int[] nums, int target) {
        int Index1 = -1 , Index2 = -1;
        int lo = 0 , hi = nums.length-1;
        while(lo<=hi){
            int mid  = (lo+hi)/2;
            if(nums[mid]<target){
                lo=mid+1;
            }else if(nums[mid]>target){
                hi=mid-1;
            }else{
                Index1=mid;
                hi = mid-1;
            }
        }
        lo=0 ; hi = nums.length-1;
        while(lo<=hi){
            int mid  = (lo+hi)/2;
            if(nums[mid]<target){
                lo=mid+1;
            }else if(nums[mid]>target){
                hi=mid-1;
            }else{
                Index2=mid;
                lo = mid+1;
            }
        }
        return new int[] {Index1 , Index2};
    }
}