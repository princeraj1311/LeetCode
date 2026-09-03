class Solution {
    public boolean uniformArray(int[] nums1) {
        int smallodd = Integer.MAX_VALUE;
        for(int num : nums1){
            if(num % 2 == 1)
                smallodd = Math.min(smallodd, num);
            }
        if(smallodd == Integer.MAX_VALUE)
            return true;
        
        for(int num : nums1){
            if(num % 2 == 0 && num<=smallodd)
            return false;
        }
        return true;        
    }
}