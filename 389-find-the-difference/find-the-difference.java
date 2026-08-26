class Solution {
    public char findTheDifference(String s, String t) {
           char extra = 0;
           for(char i = 0; i<s.length() ; i++){
               extra ^= s.charAt(i);}
           for(char i = 0; i<t.length() ; i++){
               extra ^= t.charAt(i);
              }
            return extra;
    }
}
        
