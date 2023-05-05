//my solution
class Solution {
    public String truncateSentence(String s, int k) {
        String ans="";
        int space=0;
        int n=s.length();
        for(int i=0;i<n;i++){
            char c=s.charAt(i);
            if(c==' '){
                space++;
            }
            if(space==k){
                break;
            }
            ans=ans+c;
        }
        return ans;
    }
}