//my solution
class Solution {
    public int numIdenticalPairs(int[] nums) {
        int n=nums.length;
        int result=0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(nums[i]==nums[j]){
                    result++;
                }
            }
        }
        return result;
    }
}