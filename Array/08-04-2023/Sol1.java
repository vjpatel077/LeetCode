//my solution
class Solution {
    public int removeElement(int[] nums, int val) {
        int n=nums.length;
        int s=0,e=n-1;
        while(s<=e){
            if(nums[e]==val){
                e--;
            }
            else if(nums[s]==val){
                int temp=nums[s];
                nums[s]=nums[e];
                nums[e]=temp;
                s++;
            }
            else{
                s++;
            }
        }
        return e+1;
        
    }
}