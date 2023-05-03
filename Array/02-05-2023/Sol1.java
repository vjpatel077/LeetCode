//my solution
class Solution {
    public int[] countPoints(int[][] points, int[][] queries) {
        int q = queries.length;
        int p = points.length;
        int[] ans = new int[q];
        double dis=0,x=0,y=0;
        for(int i=0;i<q;i++){
            int count=0;
            for(int j=0;j<p;j++){
                x= Math.abs(points[j][0]-queries[i][0]);
                x= Math.pow(x,2);
                y= Math.abs(points[j][1]-queries[i][1]);
                y= Math.pow(y,2);
                dis= Math.sqrt(x+y);
                if(dis<=queries[i][2]){
                    count++;
                }
            }
            ans[i]=count;
        }
        return ans;
    }
}