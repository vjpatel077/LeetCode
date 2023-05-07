//my solution
class Solution {
    public int maximizeSum(int[] nums, int k) {
        int n=nums.length;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(nums[i]>max){
                max=nums[i];
            }
        }
        int ans = (k * (2*max + (k-1)))/2;
        return ans;
    }
}