class Solution {
    public int[] leftRigthDifference(int[] nums) {
        int n=nums.length;
        int[] ans= new int[n];
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=nums[i];
        }
        int leftsum=0;
        int rightsum=sum;
        for(int i=0;i<n;i++){
            ans[i]=Math.abs(leftsum-(rightsum-nums[i]-leftsum));
            leftsum+=nums[i];
        }
        return ans;
    }
}