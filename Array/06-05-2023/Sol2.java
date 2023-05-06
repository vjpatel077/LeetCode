//my solution
class Solution {
    public int findGCD(int[] nums) {
        int n=nums.length;
        int max= Integer.MIN_VALUE;
        int min= Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            if(nums[i]>max){
                max=nums[i];
            }
            if(nums[i]<min){
                min=nums[i];
            }
        }
        int ans = gcd(min,max);
        return ans;
    }

    public int gcd(int a, int b){
        if(a==0){
            return 0;
        }
        if(b==0){
            return 0;
        }
        if(a==b){
            return a;
        }
        else if(a>b){
            return gcd(a-b,b);
        }
        else{
            return gcd(a,b-a);
        }
    }
}