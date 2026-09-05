class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int n = nums.length;
        int i = 0 ; int j = 1 ;
        while(i < n && j < n){
            while (i < n && nums[i] % 2 == 0){
                i = i+2;
            }
            while (j < n && nums[j] % 2 == 1){
                j = j+2;
            }
            if(i < n && j< n){
                swap(i,j,nums);
            }
        }
        return nums;
    }
    private void swap (int i , int j , int[] nums){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}