class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int l=1;
        Arrays.sort(piles);
        int r=piles[piles.length-1];
        int ans=0;
        while(l<=r){
            int hours=0;
            int k=l+(r-l)/2;
            for(int i:piles){
                hours+=i/k;
                if(i%k!=0){
                    hours++;
                }

            }
            if(hours<=h){
                ans=k;
                r=k-1;
            }
            else{
                l=k+1;
            }

        }
        return ans;
        
    }
}
