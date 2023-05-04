// my solution
class Solution {
    public int differenceOfSum(int[] nums) {
        int n=nums.length;
        int element_sum= elementsum(n,nums);
        int digit_sum = 0;
        for(int i=0;i<n;i++){
            digit_sum += digitsum(nums[i]);
        }
        int ans= Math.abs(element_sum - digit_sum);
        return ans;
    }
    public int elementsum(int n, int[] nums){
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=nums[i];
        }
        return sum;
    }
    public int digitsum(int x){
        int sum=0;
        int rem=0;
        while(x>0){
            rem=x%10;
            x=x/10;
            sum+=rem;
        }
        return sum;
    }
}