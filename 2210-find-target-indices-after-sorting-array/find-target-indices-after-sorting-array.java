class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        List<Integer> result = new ArrayList<>();
        Arrays.sort(nums);
        int Index1 = -1;
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
        if (Index1 == -1) return result;
        for(int i = Index1 ; i< nums.length && nums[i] == target ; i++){
            result.add(i);
        }
        return result;
    }
}