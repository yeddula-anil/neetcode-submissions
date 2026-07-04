class Solution {
    public int longestConsecutive(int[] nums) {
        
        HashSet<Integer> set=new HashSet<>();
        for(int i:nums){
            set.add(i);
        }
        if(set.size()==0){
            return 0;
        }
        int maxlen=1;
        for(int i:nums){
            if(set.contains(i-1)){
                continue;
            }
            else{
                int num=i;
                int len=1;
                while(set.contains(num+1)){
                    len++;
                    maxlen=Math.max(maxlen,len);
                    num=num+1;
                }
            }
        }
        return maxlen;
        
    }
}
