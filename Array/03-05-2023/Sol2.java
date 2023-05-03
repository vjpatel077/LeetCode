//my solution
class Solution {
    public int[] minOperations(String boxes) {
        int n=boxes.length();
        int[] ans = new int[n];
        for(int i=0;i<n;i++){
            ans[i]= count(i,boxes);
        }
        return ans;
    }
    public int count(int i, String boxes){
        int n=boxes.length();
        int cnt=0;
        for(int j=0;j<n;j++){
            if(boxes.charAt(j)=='1'){
                cnt += Math.abs(i-j);
            }
        }
        return cnt;
    }
}