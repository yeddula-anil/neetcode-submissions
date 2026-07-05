class Solution {
    public int characterReplacement(String s, int k) {
        int n=s.length();
        int[] freqMap=new int[26];
        int maxFreq=0;
        int ans=0;
        int l=0;
        for(int i=0;i<n;i++){
            int ch=s.charAt(i)-'A';
            freqMap[ch]++;
            maxFreq=Math.max(maxFreq,freqMap[ch]);
            
            while((i-l+1)-maxFreq>k){
                
                freqMap[s.charAt(l)-'A']--;
                l++;
            }
            ans=Math.max(ans,(i-l+1));

        }
        return ans;
        
    }
}
