class Solution {
    Set<Integer> cols=new HashSet<>();
    Set<Integer> diag1=new HashSet<>();
    Set<Integer> diag2=new HashSet<>();
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> ls=new ArrayList<>();
        char[][] board=new char[n][n];
        
        for(char[] ch:board){
            Arrays.fill(ch,'.');
        }
        backtrack(0,board,n,ls);
        return ls;
        
    }
    public void backtrack(int row,char[][] board,int n,List<List<String>> res){
        if(row==n){
            res.add(construct(board));
            return;
        }
        for(int col=0;col<n;col++){
            if(cols.contains(col) || diag1.contains(row-col) || diag2.contains(row+col)){
                continue;
            }
            board[row][col]='Q';
            cols.add(col);
            diag1.add(row-col);
            diag2.add(row+col);
            backtrack(row+1,board,n,res);
            board[row][col]='.';
            cols.remove(col);
            diag1.remove(row-col);
            diag2.remove(row+col);
        }
    }
    public List<String> construct(char[][] board){
        List<String> ls=new ArrayList<>();
        for(char[] str:board){
            ls.add(new String(str));
        }
        return ls;
    }
}
