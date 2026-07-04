class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length()==0){
            return 0;
        }
        HashSet<Character> set=new HashSet<>();
        int l=0;
        int maxlen=1;
        for(int i=0;i<s.length();i++){
            while(set.contains(s.charAt(i))){
                set.remove(s.charAt(l));
                l++;
            }
            
                set.add(s.charAt(i));
                
                
            
            maxlen=Math.max(maxlen,i-l+1);
            
            

        }
        return maxlen;
    }
}







































