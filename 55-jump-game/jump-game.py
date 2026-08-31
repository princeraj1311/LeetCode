class Solution:
    def canJump(self, nums: List[int]) -> bool:
        n=len(nums)
        ptr=0
        for i in range (n):
            if i> ptr:
                return False
            if i+nums[i]>ptr:
                ptr=nums[i]+i
        if ptr>=(n-1):
            return True
        else:
            return False
        