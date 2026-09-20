class Solution {
    public int reverseDegree(String s) {
        int sum=0, n=s.length();
        for(int i=0; i<n; i++){
            sum = sum + ((i+1)*(26 - (s.charAt(i) - 'a')));
        }
        return sum;   
    }
}