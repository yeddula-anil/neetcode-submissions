class Solution {
    public int removeElement(int[] nums, int val) {
        int n=nums.length;
        int j=0;
        int count=0;
        for(int i=0;i<n;i++){
            if(nums[i]!=val){
                int temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
                j++;
                count++;
            }
        }
        return count;
        
    }
}