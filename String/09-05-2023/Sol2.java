//my solution
class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int j = jewels.length();
        int s = stones.length();
        int cnt=0;
        for(int i=0;i<j;i++){
            cnt+=count(jewels.charAt(i),s,stones);
        }
        return cnt;
    }
    public int count(char x,int s, String stones){
        int cnt=0;
        for(int i=0;i<s;i++){
            if(stones.charAt(i)==x){
                cnt++;
            }
        }
        return cnt;
    }
}