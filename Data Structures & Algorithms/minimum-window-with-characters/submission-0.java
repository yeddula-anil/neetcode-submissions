class Solution {
    public String minWindow(String s, String t) {
        HashMap<Character,Integer> map=new HashMap<>();
        int count=0;
        int minlen=Integer.MAX_VALUE;
        int start=0;
        int minstart=0;
        for(int i=0;i<t.length();i++){
            char ch=t.charAt(i);
            map.put(ch,map.getOrDefault(t.charAt(i),0)+1);
        }
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(map.containsKey(ch)){
                if(map.get(ch)>0){
                    count++;
                }
                map.put(ch,map.get(ch)-1);
                

            }
            while(count==t.length()){
                if((i-start+1)<minlen){
                    minlen=i-start+1;
                    minstart=start;
                    
                }
                char c=s.charAt(start);
                if (map.containsKey(c)) {
                    map.put(c, map.get(c) + 1);

                    if (map.get(c) > 0) {
                        count--;
                    }
                }
                start++;
            }

        }
        return minlen==Integer.MAX_VALUE?"":s.substring(minstart,minstart+minlen);
        
    }
}
