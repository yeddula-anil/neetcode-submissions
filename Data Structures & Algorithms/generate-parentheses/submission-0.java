class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> res=new ArrayList<>();
        String curr="";
        generate(res,curr,0,0,n);
        return res;
        
    }
    public void generate(List<String> res,String curr,int open,int close,int n){
        if(curr.length()==2*n){
            res.add(curr);
        }
        if(open<n){
            generate(res,curr+"(",open+1,close,n);
        }
        if(close<open){
            generate(res,curr+")",open,close+1,n);
        }
    }
}
