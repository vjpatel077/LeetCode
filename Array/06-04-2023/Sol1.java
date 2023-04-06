// my solution ( only one solution exists)

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List <Integer> ans = new ArrayList <Integer>();
        int n =matrix.length;
        int m =matrix[0].length;
        int top=0;
        int left=0;
        int bottom=n-1;
        int right=m-1;
        //repeating while rows and columns are left
        while(left<=right && top<=bottom){
            //right -> left
            for(int i=left;i<=right;i++){
                ans.add(matrix[top][i]);
            }
            top++;
            //top -> bottom
            for(int i=top;i<=bottom;i++){
                ans.add(matrix[i][right]);
            }
            right--;
            //checking whether there is any row left
            if(top<=bottom){
                //right -> left
                for(int i=right;i>=left;i--){
                    ans.add(matrix[bottom][i]);
                }
                bottom--;
            }
            //checking whether there is any column left
            if(left<=right){
                //bottom -> top
                for(int i=bottom;i>=top;i--){
                    ans.add(matrix[i][left]);
                }
                left++;
            }
        }
        return ans;
    }
}