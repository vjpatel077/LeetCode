//my solution
class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] hash = new int[101];
        int n= nums.length;
        int[] ans = new int[n];
        for(int i=0;i<n;i++){
            hash[nums[i]]++;
        }
        for(int i=0;i<n;i++){
            ans[i] = count(nums[i],hash);
        }
    return ans;
    }

    public int count(int x,int[] hash){
        int count=0;
        for(int i=0;i<101;i++){
            if(i==x){
                break;
            }
            else{
                count+=hash[i];
            }
        }
        return count;
    }
}
