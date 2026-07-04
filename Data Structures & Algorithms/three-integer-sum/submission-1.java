class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int n=nums.length;
        List<List<Integer>> list=new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<n-2;i++){
            int l=i+1;
            int r=n-1;
            if(i > 0 && nums[i] == nums[i - 1]) {
                    continue;
            }
            while(l<r){
                int sum=nums[i]+nums[l]+nums[r];
                if(sum==0){
                    List<Integer> ls=new ArrayList<>();
                    ls.add(nums[i]);
                    ls.add(nums[l]);
                    ls.add(nums[r]);
                    list.add(new ArrayList<>(ls));
                     while(l < r && nums[l] == nums[l + 1]) l++;
                    while(l < r && nums[r] == nums[r - 1]) r--;

                    l++;
                    r--;
                }
                else if(sum<0){
                    l++;
                }
                else{
                    r--;
                }
            }
        }
        return list;
        
    }
}
