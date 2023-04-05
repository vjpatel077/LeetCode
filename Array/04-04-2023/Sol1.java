// my solution

class Solution {
    public int maxArea(int[] height) {
        int n=height.length;
        int start=0,end=n-1;
        int area=0;
        int max=0;
        while(start<end){
            area = Math.min(height[start],height[end]) * (end-start);
            max=Math.max(area,max);
            if(height[start]<height[end]){
                start++;
            }
            else if(height[start]>height[end]){
                end--;
            }
            else{
                start++;
                end--;
            }
        }
        return max;
    }
}