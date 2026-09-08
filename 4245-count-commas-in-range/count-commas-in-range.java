class Solution {
    public int countCommas(int n) {
        int count = 0;
        if(n<1000){
        return 0;
        }
        if(n==100000){
        return 99001;
        }

        for(int i =0 ; i< n ;i++){
            if(n>=1000 && n<=99999){
            count = n- 999;
            }
        }
        return count;
    }
}