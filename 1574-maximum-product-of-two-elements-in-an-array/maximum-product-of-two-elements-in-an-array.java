class Solution {
    public int maxProduct(int[] nums) {
        int max=Integer.MIN_VALUE;
        int smax=Integer.MIN_VALUE;
        int total = 0;
        int maxIndex = -1;
        for(int i=0; i<nums.length ;i++){
            if(nums[i]>max ){
                max = nums[i];
                maxIndex = i;
            }
        }for(int j= 0 ; j<nums.length ; j++){
            if(nums[j]>smax && j != maxIndex){
                smax = nums[j];
                total = ((max-1)*(smax-1));;
            }
        }return total;
        
    }
}