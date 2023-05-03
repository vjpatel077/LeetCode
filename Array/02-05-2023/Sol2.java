//my solution
class Solution {
    public int mostWordsFound(String[] sentences) {
        int max=0;
        int cnt=0;
        int n= sentences.length;
        for(int i=0;i<n;i++){
            String s = sentences[i].replaceAll("\\s","");
            cnt=sentences[i].length() - s.length() +1;
            if(cnt>max){
                max=cnt;
            }
        }
        return max;
    }
}