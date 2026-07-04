class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<String> seen=new HashSet<>();
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                if(board[i][j]=='.'){
                    continue;
                }
                String row=board[i][j]+"seen in row"+i;
                String col=board[i][j]+"seen in col"+j;
                String box=board[i][j]+"seen in box"+i/3+"_"+j/3;
                if(seen.contains(row) || seen.contains(col) || seen.contains(box)){
                    return false;
                }
                seen.add(row);
                seen.add(col);
                seen.add(box);
            }
        }
        return true;
        
    }
}
