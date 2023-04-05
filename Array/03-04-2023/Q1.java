// my solution

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m=nums1.length;
        int n=nums2.length;

        int t = m+n;
        int[] arr = new int[t];
        for(int i=0;i<n;i++){
            arr[i]=nums2[i];
        }
        for(int i=n,j=0;i<t;i++,j++){
            arr[i]=nums1[j];
        }
        Arrays.sort(arr);
        double ans=0;
        int ind= 0;
        if(t%2==0){
            ind=(t/2)-1;
            ans = (arr[ind] + arr[ind+1])/2.0;
        }
        else{
            ind=t/2;
            ans=arr[ind];
        }
        return ans;
        
    }
}
