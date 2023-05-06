//my solution
class Solution {
    public int findNumbers(int[] nums) {
        int n=nums.length;
        int cnt=0;
        for(int i=0;i<n;i++){
            if(counter(nums[i])){
                cnt++;
            }
        }
        return cnt;
    }
    
    public boolean counter(int x){
        int digits=0;
        while(x>0){
            digits++;
            x=x/10;
        }
        if(digits%2==0){
            return true;
        }
        else{
            return false;
        }
    }
}