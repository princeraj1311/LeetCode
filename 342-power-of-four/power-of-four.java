class Solution {
    public boolean isPowerOfFour(int n) {
        if(n<=0)
        return false;
        if(n==1)
        return true;
        for(int x = 1 ; x<30 ; x++){
            if(n == Math.pow(4,x)){
                return true;
            }
        }
        return false;
        
    }
}