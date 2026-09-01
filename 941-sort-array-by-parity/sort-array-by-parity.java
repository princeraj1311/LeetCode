class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int i =0 ,j= nums.length-1;
        while(i<j){
                if(nums[i] % 2 == 0 && i<j){
                    i++;
                }
                if(nums[j] % 2 == 1 && i<j){
                    j--;
                }
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;   
            }
        return nums;
    }
}