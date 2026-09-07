class Solution {
    public int subtractProductAndSum(int n) {
        int pod= 1 , sod = 0 ;
        while(n>0){
        int lastdigits = n % 10;
        n = n / 10;
        pod = pod * lastdigits;
        sod = sod + lastdigits;
        }
        return pod - sod;
    }
}