class Solution {
    public int countDigits(int num) {
        int originalnum = num;
        int result = 0;
        while(num > 0){
            int lastdigit = num % 10;
            if(originalnum % lastdigit ==0){ 
                result++;
            } 
            num = num/10;    
        }          
        return result;
        
    }
}