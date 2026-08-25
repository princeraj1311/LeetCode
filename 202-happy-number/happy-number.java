class Solution {
    public boolean isHappy(int n) {
        while (n!=1 && n!=4){
            int result =0;
        
        while(n > 0){
            int lastdigit = n % 10;
            result = result + lastdigit * lastdigit;
            n = n/10;
            }
            n = result;
        }
        return n ==1 ;
    }
}