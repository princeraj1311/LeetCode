class Solution {
    public int[] leftRightDifference(int[] nums) {
        int n = nums.length;
        int leftsum = 0;
        int rightsum = 0;
        int[] answer = new int[n];
        for(int num : nums){
            rightsum = rightsum + num;
        }
        for(int i =0; i < nums.length ; i++){
            rightsum = rightsum - nums[i];
            answer[i] = Math.abs(leftsum - rightsum);
            leftsum = leftsum + nums[i];        
        }
        return answer;
    }
}