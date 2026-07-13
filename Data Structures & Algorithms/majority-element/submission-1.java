class Solution {
    public int majorityElement(int[] nums) {
        int candidate=-1;
        int n=nums.length;
        int count=0;
        for(int i:nums){
            if(count==0){
                candidate=i;
            }
            if(i!=candidate){
                count--;
            }
            else{
                count++;
            }
        }
        return candidate;
        
    }
}