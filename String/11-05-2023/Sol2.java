//my solution
class Solution {
    public int minPartitions(String n) {
        int x = n.length();
        int max=0;
        for(int i=0;i<x;i++){
            char c = n.charAt(i);
            int num = Character.getNumericValue(c);
            if(num>max){
                max=num;
            }
        }
        return max;
    }
}