class Solution {
    public int largestRectangleArea(int[] heights) {
         Stack<Integer> st=new Stack<>();
         int n=heights.length;
         int max=0;
         for(int i=0;i<=n;i++){
            int currHeight=(i==n)?0:heights[i];
            while(!st.isEmpty() && currHeight<heights[st.peek()]){
                int height=heights[st.pop()];
                int right=i;
                int left=(st.isEmpty()?-1:st.peek());
                int width=right-left-1;
                max=Math.max(max,width*height);

            }
            st.push(i);
         }
         return max;
        
    }
}
