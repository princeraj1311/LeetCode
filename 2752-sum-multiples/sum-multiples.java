class Solution {
    public int sumOfMultiples(int n) {
        int[] arr = new int[n+1];
        int sum = 0;
        for(int i = 1; i<=n; i++){
            if(i%3 == 0 || i%5 ==0 || i%7 ==0){
                arr[i] = i;
            }
            sum =sum + arr[i];
        }
        return sum;
    }
}