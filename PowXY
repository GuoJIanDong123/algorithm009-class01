class Solution {
    public double myPow(double x, int n) {
        return n > 0 ? fastPow(x,n):1/fastPow(x,n);
    }

    public double fastPow(double x,int n) {
        if(n == 0){
           return 1;
        }
        double y = fastPow(x,n/2);
        return n%2 ==0 ? y*y:y*y*x;
    }
}
