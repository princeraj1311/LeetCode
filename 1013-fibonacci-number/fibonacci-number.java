class Solution {
    public int fib(int n) {
        if(n<=1)
        return n;
        int b = 1, a = 0;
        
        for(int i = 2 ; i<=n ; i++){
            int result = a+b;
            a=b;
            b=result;
        }
        return b;
    }
}