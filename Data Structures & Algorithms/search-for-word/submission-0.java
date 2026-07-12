class Solution {
    public boolean exist(char[][] board, String word) {
        int n=board.length;
        int m=board[0].length;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(dfs(word,board,i,j,0)){
                    return true;
                }
            }
        }
        return false;
        
    }
    public boolean dfs(String word,char[][] board,int i,int j,int ind){
        if(ind==word.length()){
            return true;
        }
        if(i<0 || i>=board.length || j<0 || j>=board[0].length || word.charAt(ind)!=board[i][j]){
            return false;
        }
        char temp=board[i][j];
        board[i][j]='#';
        boolean found=dfs(word,board,i-1,j,ind+1) || 
                      dfs(word,board,i,j-1,ind+1) ||
                      dfs(word,board,i+1,j,ind+1) ||
                      dfs(word,board,i,j+1,ind+1);
        board[i][j]=temp;
        return found;
    }
}
