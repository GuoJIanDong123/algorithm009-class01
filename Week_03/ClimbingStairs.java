class Solution {
    public int climbStairs(int n) {

        if(n <= 2 ) {
            return n;
        }
        int fisrt = 1;
        int second = 2;
        for(int i = 3;i<=n;i++) {
            int third = fisrt +second;
            fisrt = second;
            second = third;
        }

        return second;

        



    }
}
