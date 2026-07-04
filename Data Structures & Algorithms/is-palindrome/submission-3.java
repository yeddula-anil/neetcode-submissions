class Solution {
    public boolean isPalindrome(String s) {
        if(s==" "){
            return true;
        }
        int l=0;
        int r=s.length()-1;
        while(l<=r){
            char first = Character.toLowerCase(s.charAt(l));
            char last = Character.toLowerCase(s.charAt(r));
            while(l<r && !Character.isLetterOrDigit(first)){
                l++;
                first = Character.toLowerCase(s.charAt(l));
                
            }
            while(l<r && !Character.isLetterOrDigit(last)){
                r--;
                last = Character.toLowerCase(s.charAt(r));
            }
            if(first!=last){
                return false;
            }
            l++;
            r--;
        }
        return true;

        
    }
}
