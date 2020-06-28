class Solution {
    public int numDecodings(String s) {
        return getAns(s,0);

    }
    private int getAns(String s,int start) {
        if(start==s.length()) {
            return 1;
        }
        if(s.charAt(start)=='0'){
            return 0;
        }
        int ans1 = getAns(s,start+1);
        int ans2 = 0;
        if(start < s.length()-1){
            int ten = (s.charAt(start)-'0')*10;
            int one = (s.charAt(start+1)-'0');
            if(ten+one <=26) {
                ans2 = getAns(s,start+2);
            }
        } 
        return ans1+ans2;
    }
}
