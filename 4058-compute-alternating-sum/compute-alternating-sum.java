class Solution {
    public int alternatingSum(int[] nums) {
        int n = nums.length;
        int evensum = 0;
        int oddsum = 0;
        int result = 0;
        for(int i = 0 ; i<n; i++){
            if(i==0 || i%2 == 0){
                evensum = evensum + nums[i];
            }else{
                oddsum = oddsum + nums[i];
            }
        result = evensum - oddsum;
        }
        return result;
    }
}